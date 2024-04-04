package C_java;

public class C02_method {
    static void createRabbit(){
        System.out.println(
            "====================\n"
            + " 	  /)/)\n"
            + "	(  ..)\r\n"
            + "	(   >♡\r\n"
            + "Have a Good Time.\n"
            + "===================="
            );
    System.out.println();
    System.out.println();   
    }
    static String makeBanner(String msg){
        return "* * *"+msg+"* * * ";

    }
    public static void main(String[] args) {
        createRabbit();
        System.err.println( makeBanner("현영"));  
    }

}
