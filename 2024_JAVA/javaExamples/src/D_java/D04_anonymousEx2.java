package D_java;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class D04_anonymousEx2 {
    private Frame f;
    public D04_anonymousEx2(){
        f = new Frame("Anonymous innerClass");
    }

    WindowAdapter handler = new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("종료");
            System.exit(0);;
        };
    };
    public void launchFrane(){
        f.addWindowListener(handler);
        f.setSize(640,480);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        D04_anonymousEx2 da = new D04_anonymousEx2();
        da.launchFrane();
    }

}
