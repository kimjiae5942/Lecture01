package co.jiae.interfaceTest;

import java.util.ArrayList;
import java.util.Scanner;

import co.jiae.scope.Student;

public class StudentServiceImpl implements Service {
	private Student student;
	private ArrayList<Student> list;

	@Override
	public void insert() {
		Student student;
		list = new ArrayList<Student>();
		boolean c = true;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("학생을 추가하겠습니까?(Y/N)");
			String yesNo = scanner.nextLine();
			if (yesNo.equals("n") || yesNo.equals("N")) {
				c = false;
				break;
			}
			student = new Student();
			System.out.println("학번을 입력하세요");
			student.setId(scanner.nextLine());
			System.out.println("이름을 입력하세요");
			student.setName(scanner.nextLine());
			System.out.println("전공을 입력하세요");
			student.setMajor(scanner.nextLine());
			System.out.println("전화번를 입력하세요");
			student.setTel(scanner.nextLine());

			scanner.nextLine();
			list.add(student);
		} while (c);
		scanner.close();

//		student = new Student();
//		student.setId("2020001001");
//		student.setName("황인준");
//		student.setMajor("실용음악");
//		student.setTel("010-1111-1111");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		for (Student student : list) {
			System.out.print(student.getId() + " ");
			System.out.print(student.getName() + " ");
			System.out.print(student.getMajor() + " ");
			System.out.print(student.getTel() + " ");
		}
	}
}
