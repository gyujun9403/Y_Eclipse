package sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		for(int[] row:mathScores) { //mathSores : ���� �ּҰ� ����� �迭
			int i = 0, k = 0;
			for(int data:row) { //row : mathSores���� ������ �� ��, �� ������
								//data : �࿡ ����� �� ������.
				
				System.out.println("mathScores[" + i + "][" + k + "]=" + data);
				k++;
			}
			k = 0;i++;
		}
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[] {92, 96, 80, 88, 95};
		for(int i = 0; i < englishScores.length;i++) {
			for(int k = 0; k < englishScores[i].length;k++) {
				System.out.println("englishScores[" + i + "][" + k + "]=" + englishScores[i][k]);
			}
		}
	}

}
