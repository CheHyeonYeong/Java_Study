package F_java;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class F05_FileOutputStreamEx {
    public static void main(String[] args) {
        //문자열을 입력 받아서 해당 문자열을 파일로 내보내기
        //입력
        Scanner scan = new Scanner(System.in);
        System.out.println("파일명을 입력하세요 : ");
        String name = scan.next();
        
        //빈 객체 선언
        OutputStream fos = null;
        try {
            //fileOutputStream 생성
            fos = new FileOutputStream("C:\\fileTest"+name+"txt");
            System.out.println("문장 입력 : ");
            scan.nextLine(); //버퍼 정리

            String str = scan.nextLine();
            byte[] bs = str.getBytes(); //char가 아닌 byte단위의 길이값을 받아옴

            fos.write(bs);
            System.out.println("파일이 정상적으로 저장되었습니다.");

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try{
                fos.close();
                scan.close();
            }
            catch (Exception e2){e2.printStackTrace(); }
        }
    }
}
