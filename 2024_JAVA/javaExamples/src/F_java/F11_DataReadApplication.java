package F_java;
import java.io.FileInputStream;
import java.io.DataInputStream;

public class F11_DataReadApplication {
    public static void main(String[] args) {
        FileInputStream fis = null;
        DataInputStream dis = null;        
        try {
            fis = new FileInputStream("customer.data"); //헤헤 >.0 이따가 다시 해보자!
            dis = new DataInputStream(fis);
            String name = null;
            while ((name = dis.readUTF())!=null) {
                System.out.println(name);
                System.out.println(dis.readChar());
                System.out.println(dis.readUTF());
                System.out.println(dis.readInt());
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            if(dis !=null){
                try {
                    dis.close();
                } catch (Exception e) {
                    
                }
            }
        }
    }
}
