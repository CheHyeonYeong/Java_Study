package D_java;
import java.util.Calendar;

public class D10_Calender {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        int year = cal.get(Calendar.YEAR);
        System.out.println(year);

        int month = cal.get(Calendar.MONTH)+1;
        int date = cal.get(Calendar.DATE);
        int hour = cal.get(Calendar.HOUR);
        int hod = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
        int millisec = cal.get(Calendar.MILLISECOND);

        System.out.printf("%d년 %d월 %d일 - %02d:%d:%d.%d\n", year,month,date,hour,min,sec,millisec);

        printDayOfSeries(cal);

        cal.set(Calendar.DATE, 5);
        printDayOfSeries(cal);

        //원하는 필드 더하기 .add()
        cal.add(Calendar.DATE,8);
        printDayOfSeries(cal);

    }
    static void printDayOfSeries(Calendar cal){
        //해당년도의 날짜
        //DayOfYear
        int dayOfYear = cal.get(Calendar.DAY_OF_MONTH);
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //요일 -> 1 : 일요일~ 7: 토요일
        int dayofWeekInMonth = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println(Calendar.MONDAY);;    

        
    }

}
