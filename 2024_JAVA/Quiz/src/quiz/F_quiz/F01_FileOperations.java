package quiz.F_quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class F01_FileOperations {
    public static void main(String[] args) {
        // 1) 윤동주.txt 파일 또는 디렉터리 존재 확인
        File file = new File("윤동주.txt");
        if (file.exists()) {
            System.out.println("윤동주.txt 파일 또는 디렉터리가 존재합니다.");
        } else {
            System.out.println("윤동주.txt 파일 또는 디렉터리가 존재하지 않습니다.");
        }


        // 2) FileTest/testFile/temp 디렉터리로 파일 이동
        File destinationDir = new File("C:/FileTest/testFile/temp");
        if (!destinationDir.exists()) {
            destinationDir.mkdirs();
            System.out.println("C:/FileTest/testFile/temp 디렉터리를 생성했습니다.");
        }
        else{
            System.out.println("이미 파일이 존재합니다.");
        }
            File newFile = new File("C:\\fileTest\\윤동주.txt");

                System.out.println("윤동주.txt 파일을 이동했습니다.");
    
                // 3) 이동한 위치에서 윤동주.txt 파일 읽기
                try (BufferedReader reader = new BufferedReader(new FileReader(newFile))) {
                    System.out.println("이동한 위치에서 윤동주.txt 파일을 읽습니다:");
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

        

        
    }

}
