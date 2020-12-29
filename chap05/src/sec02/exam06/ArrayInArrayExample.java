package sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		for(int[] row:mathScores) { //mathSores : 행의 주소가 저장된 배열
			int i = 0, k = 0;
			for(int data:row) { //row : mathSores에서 가져온 각 행, 즉 데이터
								//data : 행에 담겨진 각 데이터.
				
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
