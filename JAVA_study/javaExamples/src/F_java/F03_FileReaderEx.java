package F_java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;

public class F03_FileReaderEx {
    public static void main(String[] args) {
        
        File file = new File("C:\\fileTest\\a.txt");
        FileReader in = null;

        char[] cbuf = new char[100];

        try {
            in = new FileReader(file); //기준 데이터가 char -> 글자를 그대로 읽을 수 있다.
            String content = "";
            while (true) {
                // int data = in.read();
                // System.out.printf("%x",data);
                // System.out.print((char)data); 
                // if(data ==-1) break;

                int data = in.read(cbuf);
                System.out.println(data);
                if(data!=-1){
                    content = new String(cbuf,0,data);
                }
                else break;
                System.out.println(content);

            }
        } catch (Exception e) {
            
        }
        finally{
            try{
                in.close();
            }
            catch (Exception e2){

            }
        }
        

       
    }
}
