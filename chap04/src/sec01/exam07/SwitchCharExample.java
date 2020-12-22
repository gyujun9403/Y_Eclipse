package sec01.exam07;
import java.util.Scanner;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade;
		Scanner scanner = new Scanner(System.in);
		System.out.print("등급을 입력하세요 : ");
		grade = scanner.next().charAt(0);
		//charAt(N) : 문자열에서 N번째에 위치한 유니코드 단일문자를 리턴한다.
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
			default : 
				System.out.println("손님 입니다.");
		}
		scanner.close();
	}

}
