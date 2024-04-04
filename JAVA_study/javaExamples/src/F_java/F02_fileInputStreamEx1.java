package F_java;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;

public class F02_fileInputStreamEx1 {

    public static void main(String[] args) {
        InputStream fis = null;

        try {
            
            File file = new File("C:\\fileTest\\a.txt");
            fis = new FileInputStream(file);

            //버퍼 공간
            byte[] buffer = new byte[100];
            String content = "";
            while (true) {
                // int data = fis.read(buffer);
                // System.out.println(data);
                //데이터 읽기가 끝날 때.. -1인 경우
                // if(data !=-1) content = new String(buffer, 0 , data);
                // else break;
                // System.out.println(content);

                int data = fis.read();
                System.out.print(data);

                if(data==-1) break; 
            }


            System.out.println("=================다른 방식 ====================");

            ///다른 방식으로 읽기  
            int readCount = fis.read(buffer);//처음 블럭 읽기
            while (readCount != -1) {
                String data = new String(buffer,0,readCount); //데이터 처리
                System.out.println(data);
                readCount = fis.read(buffer); //다음 블럭 읽기

            }

            //데이터 읽기
        } catch (FileNotFoundException e) {
            System.out.println("해당 경로의 파일을 찾을 수 없습니다.");
            
        }catch(IOException ex){
            System.out.println("파일을 읽을 수 없습니다.");
        }
        finally{
            try {
                //객체 정리
                fis.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
