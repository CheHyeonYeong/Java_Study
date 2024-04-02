package I_java;

import java.util.List;
import java.util.Scanner;

import I_java.obj.TestDAO;
import I_java.obj.TestVO;
import obj.PersonsVO;

public class I10_MariaDB {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TestDAO dao = new TestDAO();
        TestVO vo = new TestVO();


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

        
        List<TestVO> list = dao.allPersons();

        for(TestVO pvo : list){
            pvo.toString();
        }
		System.out.println("특정 id를 가진 Persons 출력");
		System.out.print("id를 입력해주세요");
		int ids = s.nextInt();
		TestVO svo = dao.selectOne(ids);
		System.out.println(svo);

		System.out.println("<<수정하기>>");
		System.out.print("특정 id 선택하세요 : ");
		int id2 = s.nextInt();
		TestVO uVo = dao.selectOne(id2);
		System.out.print("수정할 성을 입력하세요("+uVo.getLastName()+") : ");
		String lastName = s.next();
		if(!lastName.equals("")) {
			uVo.setLastName(lastName);
		}
		System.out.print("수정할 이름을 입력하세요("+uVo.getFirstName()+") : ");
		String firstName = s.next();
		if(!lastName.equals("")) {
			uVo.setFirstName(firstName);
		}
		System.out.print("수정할 나이을 입력하세요("+uVo.getAge()+") : ");
		int age = s.nextInt();
		if(age != 0 && age >= 0) {
			uVo.setAge(age);
		}
		System.out.print("수정할 도시 입력하세요("+uVo.getCity()+") : ");
		String city = s.next();
		if(!city.equals("")) {
			uVo.setCity(city);
		}

		int result = dao.update(uVo);
		if(result != 0) {
			System.out.println("수정 성공!!!");
		}else {
			System.out.println("수정 실패!!!");
		}

        
		s.close();

    }
}


