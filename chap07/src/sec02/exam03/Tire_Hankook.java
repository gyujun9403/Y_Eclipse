package sec02.exam03;

public class Tire_Hankook extends Tire{
	public Tire_Hankook(String location, int maxRotation) {
		super(location, maxRotation);
		//this.location = location;
		//this.maxRotation = maxRotation;
	}
	public boolean roll() {
		sumRotation++;
		int life = maxRotation - sumRotation;
		if(life > 0) {
			System.out.println(location + " Hankook������ ���� ������ " + life + "ȸ��");
			return true;
		}
		else {
			System.out.println(location + " Hankook������ �������ϴ�!!!!!");
			return false;
		}
	}
}
