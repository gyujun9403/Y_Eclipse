package sec02.exam09;
import java.util.Scanner;

public class BreakOutterExample {

	public static void main(String[] args) {
		char charval1, charval2;
		int Num, i = 0;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("�빮�ڸ� �Է��� �ּ��� : ");
			charval1 = scanner.next().charAt(0);
			if(charval1 >= 'A' && charval1 <= 'Z') break;
		}
		while(true) {
			System.out.print("�ҹ��ڸ� �Է��� �ּ��� : ");
			charval2 = scanner.next().charAt(0);
			if(charval2 >= 'a' && charval2 <= 'z') break;
		}
		System.out.print("���°�� �������? : ");
		Num = scanner.nextInt();
		Outter : for(char upper='A'; upper <= charval1; upper++) {
			for(char lower='a'; lower <= charval2; lower++) {
				System.out.println(upper + " - " + lower);
				if(++i == Num) break Outter;
			}
		}
	System.out.println("���α׷� ���� ����");
	}

}
