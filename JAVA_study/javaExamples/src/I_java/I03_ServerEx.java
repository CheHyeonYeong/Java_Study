package I_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class I03_ServerEx {
    public static void main(String[] args) {
        //소켓 생성
        ServerSocket server =null;
        try {
            server = new ServerSocket(9999);

            //무한 반복 (클라이언트 접속 대기)
            while (true) {
                System.out.println("클라이언트 접속 대기");
                Socket client = server.accept(); //연결 성공시 Socket 객체 반환

                System.out.println("스레드 생성"); //클라이언트와 서버간의 개별 세션 생성을 위함

                //http 스레드를 만듦

                HTTPThread ht = new HTTPThread(client);
                ht.start();

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}

class HTTPThread extends Thread {
    private Socket client;

    BufferedReader br;
    PrintWriter pw;     //web에서 사용할 데이터 전달을 위해서 사용

    public HTTPThread(Socket client){
        this.client = client;
       
        try {
            br = new BufferedReader(new InputStreamReader(client.getInputStream())); //클라이언트가 보낸 데이터 처리를 위해 (서버 내부 처리)
            pw = new PrintWriter(client.getOutputStream()); //응답 데이터 처리 (외부로 보냄)
        } catch (IOException e) {System.out.println(e.getMessage());}


    }

    @Override
    public void run() {
        BufferedReader fbr = null;

        DataOutputStream outToClient = null;

        try {
            String line = br.readLine(); //Line : GET /filename/HTTP/1.1  http 요청 헤더의 첫번째줄
            System.out.println("Http Header : "+line); //file네임을 가져오려고 함!
            int start = line.indexOf("/")+1; //file name은 root file 이후부터
            int end = line.lastIndexOf("HTTP")-1; //http 이전까지

            String fileName = line.substring(start, end);

            //서버에 요청받은 데이터를 전달해줄 것이다.
            if(fileName.equals("")){
                fileName = "index.html";
            }
            System.out.println("사용자 요청 파일 : "+fileName);
            fbr = new BufferedReader(new FileReader(fileName));

            String fileLine = null;
            pw.println("HTTP/1.0 200 Document Follows \r\n");
            while ((fileLine = fbr.readLine())!=null) { //값을 집어넣겠다!!!
                pw.println(fileLine);
                pw.flush();
                
            }
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        } finally{
            try {
                if(br !=null) br.close();
                if(pw !=null) pw.close();
                if(client != null) client.close();
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }
    }
    
}