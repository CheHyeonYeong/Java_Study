package F_java;

import java.io.File;
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

        //4. 
    }
}
