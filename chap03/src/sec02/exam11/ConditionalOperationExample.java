package sec02.exam11;
import java.util.Scanner;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score;
		Scanner scanner = new Scanner(System.in);
		System.out.print("����� ������ �Է��ϼ��� : ");
		score = scanner.nextInt();
		char grade = (score>90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "���� " + grade + "����Դϴ�. ");
		
		scanner.close();
	}

}
