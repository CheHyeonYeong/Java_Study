package D_java;
import java.io.FileInputStream;
import java.io.IOException;

import C_java.inhereritance.Employee;


public class D08_autoResourceManageEx {
    public static void main(String[] args) {
        //파일 입출력

        //자동으로 자원을 릴리즈...
        try(FileInputStream in = new FileInputStream("a.txt")) {
            System.out.println("read Data : "+in.read());
        } catch (NullPointerException | IOException ex) {
            //in 변수 참조 x
            System.out.println("예외 처리");
        }

        //직접 자원에 대해 제어

        System.out.println("2번");

        FileInputStream in2 = null;

        try {
            in2 = new FileInputStream("C:\\Users\\hyeonyeong\\Desktop\\2024-1\\java\\2024_JAVA\\javaExamples\\src\\D_java\\a.txt");
            System.out.println("read Data : "+in2.read());
        } catch (NullPointerException e) {
            System.out.println("예외 처리합니다");
            System.out.println(e.toString());
        }catch(IOException e){
            System.out.println(in2);
            System.out.println("예외처리 합니다");
            System.out.println(e.toString());
        }finally{
            try {
                in2.close();
            } catch (IOException e) {
            }
        }
    }
}
