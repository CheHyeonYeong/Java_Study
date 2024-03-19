package D_java;

import java.util.Date;
import java.text.SimpleDateFormat;

public class D12_Date {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());;
        //특정 문자열 포맷으로 얻어내고 싶어요
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd, E요일, 1년중 D번째 날 a HH:mm:ss");
        String time = sdf.format(date);
        System.out.println(time);
    }
}
