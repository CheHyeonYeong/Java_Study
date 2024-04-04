package F_java;

import java.io.FileWriter;
import java.io.File;

public class F04_FileWriterEx {
    public static void main(String[] args) {
        FileWriter out = null;
        File file = new File("C:\\fileTest\\a.txt");
        try {
            
            //fileWriter 객체 생성
            out = new FileWriter(file,true);//append가 false이면 추가 x, true면 추가 가능

        } catch (Exception e) {
          
            e.printStackTrace();
        }
        finally{
            try{
                out.close();
            }
            catch (Exception e2){ }
        }
    }
}
