package sec02.exam10;
import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		int Num;
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		Num = scanner.nextInt();
		for(int i = 1; i <= Num; i++) {
			if(i%2 != 0) continue;
			System.out.println(i);
		}
		scanner.close();
	}

}
