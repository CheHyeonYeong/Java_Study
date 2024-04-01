package I_java;

import java.util.List;
import java.util.Scanner;

import obj.PersonsDAO;
import obj.PersonsVO;

public class I08_personsMain {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        PersonsDAO dao = new PersonsDAO();
        PersonsVO vo = new PersonsVO();
        
        //데이터 추가

        // System.out.println("Persons에 데이터 추가 ");
        // System.out.println("성(lastname) 입력 : ");
        // vo.setLastName(s.next());
        // System.out.println("이름(firstname) 입력 : ");
        // vo.setFirstName(s.next());
        // System.out.println("나이(age) 입력 : ");
        // vo.setAge(s.nextInt());
        // System.out.println("주거지(city) 입력 : ");
        // vo.setCity(s.next());

        // int result = dao.insert(vo); //report 추가

        // if(result!= 0){
        //     System.out.println("레코드 추가 성공");
        // }
        // else{
        //     System.out.println("레코드 추가 실패");
        // }

        
        List<PersonsVO> list = dao.allPersons();

        for(PersonsVO pvo : list){
            pvo.toString();
        }

        // vo = dao.selectOne(1);
        // System.out.println(vo.toString());

        vo = dao.selectOne("user");
        System.out.println(vo.toString());
    
    }
}
