package D_java;

public class D16_StringBuilder {

    public static void main(String[] args) {
        //StringBuilder
        String str = "Hello, world! 123456789";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("StringBuilder에 있는 문자열 : "+ sb);

        //1. append
        sb.append("10");
        System.out.println("append(10)의 결과 : "+sb);

        sb.append(true); //문자열로 변환해서 넣어준다
        System.out.println("append(true)의 결과 : "+sb);
        
        //2. insert(idx, add char)
        sb.insert(7,"insert 합니다");
        System.out.println("insert의 결과 : "+sb); //world는 뒤로 밀린다.
        
        //3. Delete(시작 인덱스, 끝 인덱스)

        sb.delete(sb.indexOf("insert 합니다"),sb.indexOf("insert")+"insert 합니다".length());
        System.out.println("delete의 결과 : "+sb); 

        //4. DeleteCharAt()
        sb.deleteCharAt(12);
        System.out.println("deleteCharAt의 결과 : "+sb); 

        //5. setCharAt() : 인덱스 위치에 문자를 추가
        sb.setCharAt(12, '!');
        System.out.println("SetCharAt의 결과 : "+sb);

        //6. replace()
        sb.replace(12, 14, "! 1");
        System.out.println("replace(12, 14, \"! 1\")의 결과 : "+sb);

        //7. reverse()
        sb.reverse();
        System.out.println("reverse() : "+sb);

    }
}
