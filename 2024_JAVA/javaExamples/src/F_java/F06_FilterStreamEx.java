package F_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;


public class F06_FilterStreamEx {
    public static void main(String[] args) {
        
        //reader 일반 스트림
        FileReader input = null;
        FileWriter output = null;
        
        //filtered Stream
        BufferedReader bufInput  = null;
        BufferedWriter bufOutput = null;
        
        try {
            File inFile = new File("C:/fileTest/testFile/test.txt");
            File outFile = new File("C:/fileTest/testFile/test_out.txt");

            //필터 스트림은 대상이 노드 스트림을 대상이다

            //노드 스트림
            input = new FileReader(inFile);
            output = new FileWriter(outFile);

            //필터 스트림

            bufInput = new BufferedReader(bufInput); 
            bufOutput = new BufferedWriter(bufOutput);

            String line;
            line = bufInput.readLine(); //문자열에서 \n을 만날 때까지, 없으면 null을 반환

            System.out.println(line);
            while (line !=null) {
                bufOutput.write(line,0,line.length());
                bufOutput.newLine(); //줄바꿈 + "\n"을 입력한 것과 같다
                line = bufInput.readLine();
            }
            System.out.println(inFile +">>"+outFile);


        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try{
                if(bufInput!=null)bufInput.close();
                if(bufInput!=null)bufOutput.close();
            }
            catch (Exception e2){e2.printStackTrace(); }
        }
    }
}
