package sec02.exam03;

public class Tire_Kumho extends Tire{
	public Tire_Kumho(String location, int maxRotation) {
		super(location, maxRotation);
		//this.location = location;
		//this.maxRotation = maxRotation;
	}
	public boolean roll() {
		sumRotation++;
		int life = maxRotation - sumRotation;
		if(life > 0) {
			System.out.println(location + " Kumho바퀴의 남은 수명은 " + life + "회전");
			return true;
		}
		else {
			System.out.println(location + " Kumho바퀴가 터졌습니다!!!!!");
			return false;
		}
	}
}
