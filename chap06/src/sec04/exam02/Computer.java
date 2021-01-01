package sec04.exam02;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		for (int s:values) {
			sum += s;
		}
		return sum;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		for (int s:values) {
			sum += s;
		}
		return sum;
	}
}
