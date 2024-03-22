package F_java;

import java.io.FileOutputStream;;

public class F08_TextWriteApplication {
    public static void main(String[] args) {
        String data1 = "홍길동, 남자, hong@naver.com,1589";
        String data2 = "강감찬, 남자, kang@naver.com, 879";
        FileOutputStream fos =null;
        try {
            fos = new FileOutputStream("customer.txt");

            fos.write(data1.getBytes());
            fos.write('\n');
            fos.write(data2.getBytes());
            System.out.println("File saved");
        } catch (Exception e) {
            System.out.println(e.getMessage());


        }finally{
            if(fos!=null){
                try {
                    fos.close();
                } catch (Exception e) {
                    
                }
            }
        }
    }

}
