package D_java;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class UserClass{
    @UserAnont (value = "A")
    public void methodA(){
        System.out.println("methodA() start");
    }
    @UserAnont (value="B")
    public void methodB(){
        System.out.println("methodB() start");
    }
}
public class D06_Anontation {
    public static void main(String[] args) throws Exception{
        Method method[] = UserClass.class.getDeclaredMethods();
		System.out.println("method[]에 있는 내용의 갯수 : "+method.length);
		for (int i = 0; i < method.length; i++) {
			String methodName = method[i].getName();
			UserAnont annot = method[i].getAnnotation(UserAnont.class);

			System.out.println(methodName + "의 어노테이션 ");
			System.out.println("value : " + annot.value() + " ");
			System.out.println("number : "+ annot.number() + " " );
			System.out.println();
			method[i].invoke(new UserClass(), null);  //메서드 실행
		}
    }
}
