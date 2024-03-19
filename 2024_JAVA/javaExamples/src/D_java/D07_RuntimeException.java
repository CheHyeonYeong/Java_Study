package D_java;

public class D07_RuntimeException {
    public static void main(String[] args) {
        
        // makeException(5);
        // makeException2();
        // makeException3();
        // makeException4();
        // makeException6();
        makeException7();
    }
    public static int makeException(int input){
        int divided = 0;
        int result = input/divided;
        return result;
    }
    public static void makeException2(){
        String s = "가";
        System.out.println(s.charAt(1));
    }

    public static void makeException3() throws Exception{
        int[] a = {1,2,3};
        System.out.println(a[3]);
    }
    public static void makeException4() {
        String nothing = null;
        System.out.println(nothing.split(""));
    }
    public static void makeException5() {
        String notInt = "null";
        int a = Integer.parseInt(notInt);
    }
    public static void makeException6() {
        for (int i=0;i<Integer.MAX_VALUE;i++){
            makeException6();
        }
    }
    public static void makeException7() {
        Object[] objArr = new String[3];
        objArr[0]=0; 
            //선언자체가 Object로 되어 있음으로 컴파일 오류 발생 x

    }
    public static void makeException8() {
        Object[] objArr = new String[3];
        objArr[0]="0"; 
        Integer a = (Integer) objArr[0]; //문자열 -> 형변환이 아니기 때문에 문제가 된다
    }
    
}
