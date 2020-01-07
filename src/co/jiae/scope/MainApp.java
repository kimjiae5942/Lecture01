package co.jiae.scope;

public class MainApp {
	
	public static void main(String[] args) {
		Member member = new Member();
		member.setId("Lee");
		member.setPw("1234");
		member.setName("이동혁");
		member.setAddr("제주특별시");
		member.setTel("010-1234-5678");
		member.setGrade(1);
		
		member.toString();
		
		member = new Member("Nana","2345","나재민","서울광역시 중구 종로","010-2222-2226",2);
		member.toString();
	}

}
