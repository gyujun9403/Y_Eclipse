package sec02.exam02;

public class ArrayCreatByValueListExample {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i = 0; i < scores.length;i++) {sum1 += scores[i];}
		System.out.println("����1 : " + sum1);
		
		//��� Syntax error on token(s), misplaced construct(s) ���
		//int sum2 = add(int[] {83, 90, 87});
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("����2 : " + sum2);
	}
	
	
	public static int add(int[] scores2) {
		int sum = 0;
		for(int i = 0; i < scores2.length; i++) {sum += scores2[i];}
		return sum;
	}
}
