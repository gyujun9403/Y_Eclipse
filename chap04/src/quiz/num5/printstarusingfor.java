package quiz.num5;
import java.util.Scanner;

public class printstarusingfor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N;
		System.out.print("정수를 입력하세요 : ");
		N = scanner.nextInt();
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j < i; j++)
				System.out.print('*');
			for(int k = 0; k < N-i; k++)
				System.out.print(' ');
			System.out.print('\n');
		}
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j < N-i; j++)
				System.out.print(' ');
			for(int k = 0; k < i; k++)
				System.out.print('*');
			System.out.print('\n');
		}
		scanner.close();
	}

}
