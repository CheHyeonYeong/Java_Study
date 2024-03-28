package I_java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;

public class I02_UrlEx {
    public static void main(String[] args) {
        try {
            URL url = null;
            url = new URL("https://search.naver.com/search.naver?ssc=tab.kin.kqna&where=kin&sm=tab_jum&query=url");

            System.out.println("authority : "+url.getAuthority()); //권한을 누가 갖고 있는지!!
            System.out.println("content : "+url.getContent()); //http input stream에 있는 것
            System.out.println("Protocol : "+url.getProtocol()); //프로토콜을 알 수 있다
            System.out.println("host : "+url.getHost());
            System.out.println("port : "+url.getPort());
            System.out.println("path : "+url.getPath());
            System.out.println("file : "+url.getFile()); 
            System.out.println("query : "+url.getQuery()); 

            int data = 0;
            
            try {
                Reader is = new InputStreamReader(url.openStream()); //해당 데이터를 넘김, input stream을 받는다.
                while ((data =is.read())!=-1) {
                    System.out.print((char)data);
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            //url 커넥션
            //추상 클래스로 URL 간의 연결을 담당하는 역할을 함
            //URLConnection을 상속받아 구현한 HTTPURLConnection, JarURLConnection
            url = null;
            String address = "https://www.egovframe.go.kr/home/sub.do?menuNo=9";
            
            try {
                url = new URL(address);
                URLConnection con = url.openConnection(); //openConnection은 URLConnection 객체를 반환한다.
                System.out.println("con.toString() : "+con);

                System.out.println("getAllowUserInteraction : "+con.getAllowUserInteraction());
                System.out.println("getConnectTimeout() : "+con.getConnectTimeout());
                System.out.println("getContent() : "+con.getContent());
                System.out.println("getContentEncoding() : "+con.getContentEncoding()); //통신을 위한 정보들을 담는데 그게 굳이 필요하지 않다.
                System.out.println("getContentLength : "+con.getContentLength());

                System.out.println("getContentType : "+con.getContentType());
                System.out.println("getDate() : "+con.getDate());

                System.out.println("getDfaultAllowUesrInteraction : "+con.getDefaultAllowUserInteraction());
                System.out.println("getDefaultUserCaches() : "+con.getDefaultUseCaches());

                System.out.println("getDoInput() : "+con.getDoInput()); //집어넣은 값 출력값을 넣을 수 있냐 없냐
                System.out.println("getDoOutput() : "+con.getDoOutput());
				System.out.println("getExpiration() : "+con.getExpiration());
				System.out.println("getHeaderFields() : "+con.getHeaderFields());
				System.out.println("getIfModifiedSince() : "+con.getIfModifiedSince());
				System.out.println("getLastModified() : "+con.getLastModified());
				System.out.println("getReadTimeout() : "+con.getReadTimeout());
				System.out.println("getURL() : "+ con.getURL());
				System.out.println("getUseCaches() : "+con.getUseCaches());


                BufferedReader br = null ;
                String readline = "";
                try{
                    url  = new URL(address);
                    br = new BufferedReader(
                        new InputStreamReader(url.openStream())
                    );
                    while ((readline = br.readLine())!= null) {
                        System.out.println(readline);
                        
                    }
                }catch(IOException e){  }
                finally{
                    try {
                        if(br!=null){
                            br.close();
                        }
                    } catch (Exception e) {}
                }


            } catch (Exception e) {
                // TODO: handle exception
            }



        } catch (IOException e) {
            System.out.println(e.getMessage());
            
        }
    }


}
