package sec02.exam03;
//Car�� ��ǰ���μ� ���Ǵ� Ŭ����.
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
			System.out.println(location + " ������ ���� ������ " + life + "ȸ��");
			return true;
		}
		else {
			System.out.println(location + " ������ �������ϴ�!!!!!");
			return false;
		}
	}
}
