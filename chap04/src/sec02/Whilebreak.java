package sec02;
import java.util.Scanner;

public class Whilebreak {

	public static void main(String[] args) {
		boolean run = true;
		int Mode = 0, balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------------------");
			System.out.print("����> ");
			Mode = scanner.nextInt();
			switch(Mode) {
			case 1 :
				System.out.print("���ݾ�> ");
				balance += scanner.nextInt();
				break;
			case 2 :
				System.out.print("��ݾ�> ");
				balance -= scanner.nextInt();
				break;
			case 3 :
				System.out.println("�ܰ�> " + balance);
				break;
			case 4 :
				run = false;
				break;
			}
		}
		System.out.println("���α׷� ����");
		scanner.close();
	}

}
