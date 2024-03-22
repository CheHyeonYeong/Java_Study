package util;
import java.io.IOException;
import java.io.Writer;
import java.io.Reader;

public class Closer {
    private Closer(){} //메소드만 불러갖다 써라
    public static void closer(Writer w){
        try {
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void closer(Reader r){
        try {
            r.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
