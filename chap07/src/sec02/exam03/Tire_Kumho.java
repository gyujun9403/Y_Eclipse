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
			System.out.println(location + " Kumho������ ���� ������ " + life + "ȸ��");
			return true;
		}
		else {
			System.out.println(location + " Kumho������ �������ϴ�!!!!!");
			return false;
		}
	}
}
