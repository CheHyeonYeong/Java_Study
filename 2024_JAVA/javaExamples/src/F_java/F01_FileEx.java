package F_java;

import java.io.File;
import java.io.IOException;
public class F01_FileEx {
    static String env_path="C:\\Program Files\\Amazon Corretto\\jdk17.0.10_7\\bin;C:\\Program Files (x86)\\Common Files\\Oracle\\Java\\javapath;C:\\Program Files\\firemodels\\SMV6;C:\\Program Files\\firemodels\\FDS6\\bin;C:\\WINDOWS\\system32;C:\\WINDOWS;C:\\WINDOWS\\System32\\Wbem;C:\\WINDOWS\\System32\\WindowsPowerShell\\v1.0\\;C:\\WINDOWS\\System32\\OpenSSH\\;C:\\MinGW\\bin;C:\\ProgramData\\chocolatey\\bin;C:\\Program Files\\Git\\cmd;C:\\Program Files\\Microsoft SQL Server\\150\\Tools\\Binn\\;C:\\Program Files\\Microsoft SQL Server\\Client SDK\\ODBC\\170\\Tools\\Binn\\;C:\\Program Files\\Amazon\\AWSCLIV2\\;C:\\Users\\hyeonyeong\\AppData\\Roaming\\Python\\Python310\\Scripts;:wq;C:\\Program Files\\n" + //
                "odejs;C:\\Program Files\\n" + //
                "odejs\\;:wq;C:\\Program Files\\n" + //
                "odejs;C:\\Program Files\\dotnet\\;&JAVA_HOME%;;C:\\Program Files\\Docker\\Docker\\resources\\bin;C:\\Users\\hyeonyeong\\AppData\\Local\\Programs\\Python\\Python310\\Scripts\\;C:\\Users\\hyeonyeong\\AppData\\Local\\Programs\\Python\\Python310\\;C:\\Program Files\\MySQL\\MySQL Server 8.0\\bin;C:\\Users\\hyeonyeong\\AppData\\Local\\Programs\\Microsoft VS Code\\bin;C:\\Users\\hyeonyeong\\anaconda3\\envs\\Lecture2022_1_DataAnalysis\\Lib\\site-packages\\parso\\python;C:\\Users\\hyeonyeong\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Python 3.10;C:\\Users\\hyeonyeong\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Python 3.9;C:\\tools\\flutter\\bin;C:\\Program Files\\Git\\cmd;C:\\tools\\dart-sdk\\bin;C:\\Users\\hyeonyeong\\AppData\\Roaming\\Pub\\Cache\\bin;C:\\Program Files (x86)\\Common Files\\Oracle\\Java\\javapath\\java.exe;C:\\Program Files (x86)\\Common Files\\Oracle\\Java\\javapath\\javaw.exe;C:\\Program Files (x86)\\Common Files\\Oracle\\Java\\javapath\\javaws.exe;C:\\Users\\hyeonyeong\\AppData\\Local\\Microsoft\\WindowsApps;C:\\Program Files\\Git\\cmd\\git.exe;C:\\Program Files\\Git\\mingw64\\bin\\git.exe;C:\\Windows\\System32;C:\\Users\\hyeonyeong\\anaconda3\\envs\\server\\Scripts;C:\\Users\\hyeonyeong\\anaconda3\\Lib\\site-packages\\faiss;C:\\ProgramData\\n" + //
                "vm;C:\\Program Files\\n" + //
                "odejs;C:\\Program Files\\OpenSSL-Win64\\bin;C:\\Users\\hyeonyeong\\AppData\\Roaming\\n" + //
                "pm;C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2022.3.2\\jbr\\bin;C:\\Users\\hyeonyeong\\.dotnet\\tools";
    public static void main(String[] args) {
        
        //File객체는 파일과 디렉터리 작업을 위해서 사용하는 객체

        File f = new File("C:\\fileTest\\a.txt");

        File dir = new File("./"); //현재 작업위치
        //1.exits() : 파일 혹은 디렉터리 존재 유무 확인

        System.out.println("exits? : "+f.exists());
        System.out.println("exists? : " + dir.exists());

        //2. isDirectory() : 디렉토리 여부 확인(파일이면 false)

        System.out.println("isDirectory? : "+f.isDirectory());
        System.out.println("isDirectory? : " + dir.isDirectory());
        
        //3. isAbsolute() : 해당 경로가 절대경로 t/f 확인
        System.out.println("isAbsolute() : "+ f.isAbsolute());
        System.out.println("isAbsolute() : " + dir.isAbsolute());

        // 4. canExecute, canRead, canWrite : 권한 확인
		System.out.println("canExecute? : "+f.canExecute());
		System.out.println("canRead? : "+f.canRead());
		System.out.println("canWrite? : "+f.canWrite());

		// 5. getAbsolutePath : 절대 경로 반환 (상대경로의 절대경로를 찾아줌)
		System.out.println("./의 실제 위치(절대 경로) : "+dir.getAbsolutePath());

		// 6. 부모 폴더를 문자열 반환
		System.out.println(f.getParent());   // 문자열

		// 7. 부모 폴더를 File 객체로 반환
		File f_parent = f.getParentFile();   // File 객체
		System.out.println(f_parent);

		// 8. static 값들.... 
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);

        //환경변수
        String[] path = env_path.split(File.pathSeparator);
        for (String s:path){
            System.out.println(s);
        }
        //file에 대한 생성 수정 삭제 메서드
        File test = new File("C:\\fileTest\\temp\\abc");
        //mkdir : 해당 경로에 폴더 생성, 단 경로상 빠진 부분이 없어야 한다.
        //mkdirs : 존재하지 않는 부모 경로 폴더까지 모두 포함하여 폴더를 생성
        if(!test.exists()){//폴더가 존재하지 않는 경우
            test.mkdirs();
        }
        else{
            test.mkdir();
        }

        //createNewFile : 파일이 없으면 새로 생성
        test = new File("C:\\fileTest\\temp\\a.txt");
        try {
            test.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("실패했습니다.");
        }


        //Delete : 파일 혹은 폴더를 삭제합니다. 단, 폴더는 비어있지 않으면 삭제할 수 없다.

        test = new File("C:\\fileTest\\temp\\abc");
        test.delete();
        // test = new File("C:\\fileTest\\temp\\a.txt");
        // test.delete();
        // test = new File("C:\\fileTest\\temp");
        // test.delete();
        //renameTo : 파일이나 폴더의 이름 및 경로를 변경합니다.
        test = new File("C:/fileTest/temp");
        File dst = new File("C:/fileTest/temp2222");
        test.renameTo(dst);


    }
}
