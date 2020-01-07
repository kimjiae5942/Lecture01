package co.jiae.scope;

import co.jiae.interfaceTest.MemberServiceImpl;
import co.jiae.interfaceTest.Service;
import co.jiae.interfaceTest.StudentServiceImpl;

public class MainApp {

	public static void main(String[] args) {
//		Member member = new Member();
//		member.setId("Lee");
//		member.setPw("1234");
//		member.setName("이동혁");
//		member.setAddr("제주특별시");
//		member.setTel("010-1234-5678");
//		member.setGrade(1);
//		
//		member.toString();

//		member.insert("Nana","2345","나재민","서울광역시 중구 종로","010-2222-2226",2);
//		member.toString();
//		System.out.println(member.getId() + " " + member.getName() ); //필요한 것만 출력할 때

//		Service service = new MemberServiceImpl();
//		service.insert();
//		service.display();

		Service se2 = new StudentServiceImpl();
		se2.insert();
		se2.display();
	}

}
