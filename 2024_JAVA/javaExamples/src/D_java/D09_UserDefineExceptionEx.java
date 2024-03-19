package D_java;

class Member{
    String name;
    String phone;
    String address;

    public Member(String name, String phone, String address){
        this.name = name;
        this.phone = phone;
        this.address = address;
    }
}
public class D09_UserDefineExceptionEx {
    public static void main(String[] args) {
        D09_UserDefineExceptionEx mManager = new D09_UserDefineExceptionEx();
        try {
            mManager.insert(new Member("홍길동", "010-1223-2836", "null"));
        } catch (DuplicateKeyException e) {
            System.out.println(e.toString());
        }
    }
    public void insert(Member member) throws DuplicateKeyException{
        System.out.println("고객정보를 저장합니다");

        System.out.println(member.name + "님의 정보");
        //db에 홍길동/010-1223-2836이 있다고 간주
        if ("홍길동".equals(member.name)&&"010-1223-2836".equals(member.phone)){
            //이 경우에 DB에 이미 정보가 있는 경우가 됩니다.
            //이 때 예외를 발생시켜 insert 메서드를 호출한 곳으로 데이터가 중복됨을 알림
            throw new DuplicateKeyException("데이터가 중복됩니다.");
        }
        else{
            System.out.println("데이터베이스에 저장되었습니다.");
        }
    }
}

//사용자 정의 예외
class DuplicateKeyException extends Exception{
    public DuplicateKeyException(String message){
        System.out.println(message);
    }
    
}

