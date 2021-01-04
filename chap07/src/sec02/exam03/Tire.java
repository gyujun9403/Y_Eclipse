package sec02.exam03;
//Car의 부품으로서 사용되는 클래스.
public class Tire {
	public int maxRotation, sumRotation;
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		sumRotation++;
		int life = maxRotation - sumRotation;
		if(life > 0) {
			System.out.println(location + " 바퀴의 남은 수명은 " + life + "회전");
			return true;
		}
		else {
			System.out.println(location + " 바퀴가 터졌습니다!!!!!");
			return false;
		}
	}
}
