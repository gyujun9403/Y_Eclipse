package sec02.exam09;
import java.util.Scanner;

public class BreakOutterExample {

	public static void main(String[] args) {
		char charval1, charval2;
		int Num, i = 0;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("대문자를 입력해 주세요 : ");
			charval1 = scanner.next().charAt(0);
			if(charval1 >= 'A' && charval1 <= 'Z') break;
		}
		while(true) {
			System.out.print("소문자를 입력해 주세요 : ");
			charval2 = scanner.next().charAt(0);
			if(charval2 >= 'a' && charval2 <= 'z') break;
		}
		System.out.print("몇번째에 끝낼까요? : ");
		Num = scanner.nextInt();
		Outter : for(char upper='A'; upper <= charval1; upper++) {
			for(char lower='a'; lower <= charval2; lower++) {
				System.out.println(upper + " - " + lower);
				if(++i == Num) break Outter;
			}
		}
	System.out.println("프로그램 실행 종료");
	}

}
