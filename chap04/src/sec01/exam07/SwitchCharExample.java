package sec01.exam07;
import java.util.Scanner;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade;
		Scanner scanner = new Scanner(System.in);
		System.out.print("����� �Է��ϼ��� : ");
		grade = scanner.next().charAt(0);
		//charAt(N) : ���ڿ����� N��°�� ��ġ�� �����ڵ� ���Ϲ��ڸ� �����Ѵ�.
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("��� ȸ���Դϴ�.");
				break;
			case 'B':
			case 'b':
				System.out.println("�Ϲ� ȸ���Դϴ�.");
				break;
			default : 
				System.out.println("�մ� �Դϴ�.");
		}
		scanner.close();
	}

}
