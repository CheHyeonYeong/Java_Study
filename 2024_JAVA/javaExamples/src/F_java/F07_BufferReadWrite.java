package F_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class F07_BufferReadWrite {
    public static void main(String[] args) {
        String htmlCode = "<html><head><style>\n";
        htmlCode+="div{ \n"
            +"         width:100px;\n"
            +"         height:100px;\n"
            +"         color:white;\n"
            +"         background:red;\n"
            +"         padding:50px;\n"
            +"         font-size:30px;\n"
            +"}\n";

        htmlCode +="</style></head><body>";
        htmlCode +="<div> Hello HTML! </div>";
        htmlCode +="</body></html>";
        String path ="C:/fileTest/index.html";
        write(path, htmlCode);
    }

    public static String read(String path){
        File f= new File(path);
        FileReader fr = null;
        BufferedReader br = null;
        String code = null;
        try {
            code  = new String();
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            String line = null;
            while ((line=br.readLine() )!=null) {
                System.out.println(line);
                code +=line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try{
                if(br !=null) br.close();;
                if(fr !=null) fr.close();
            }catch(Exception ex){

            }
        }

        return code;
    }

    public static void write(String path, String code) {
        // Write
        File f = new File(path);
        FileWriter fw = null;
        BufferedWriter bw = null;
    
        try {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
    
            bw.write(code);
            bw.newLine(); // Add a new line after each line of HTML code
    
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) bw.close();
                if (fw != null) fw.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
}
