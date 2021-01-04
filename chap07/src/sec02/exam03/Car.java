package sec02.exam03;

public class Car {
	//Tire Ŭ������ �� Ŭ������ ��ǰ���μ� ���ȴ�.
	Tire FontLetf = new Tire("���� ����", 10);
	Tire FontRight = new Tire("���� ������", 5);
	Tire RearLetf = new Tire("�Ĺ� ����", 3);
	Tire RearRight = new Tire("�Ĺ� ������", 8);
	
	//����. ���ึ�� ������ ����. ���� Ÿ�̾� ��ȣ ��ȯ
	void run(){
		System.out.println("\n");
		System.out.println("-------------���� ��-------------");
		if(FontLetf.roll() == false) { stop(); changeTire(1); }
		if(FontRight.roll() == false) { stop(); changeTire(2);}
		if(RearLetf.roll() == false) { stop(); changeTire(3);}
		if(RearRight.roll() == false) { stop(); changeTire(4);}
	}
	
	void changeTire(int num) {
		switch(num) {
		case 1 :
			System.out.println("���� ���� ������ HankookŸ�̾�� ��ü�մϴ�.");
			this.FontLetf = new Tire_Hankook("���� ����", 15);
			break;
		case 2 :
			System.out.println("���� ������ ������ HankookŸ�̾�� ��ü�մϴ�.");
			this.FontRight = new Tire_Hankook("���� ������", 15);
			break;
		case 3 :
			System.out.println("�Ĺ� ���� ������ KumhoŸ�̾�� ��ü�մϴ�.");
			this.RearLetf = new Tire_Kumho("�Ĺ� ����", 15);
			break;
		case 4 :
			System.out.println("�Ĺ� ������ ������ KumhoŸ�̾�� ��ü�մϴ�.");
			this.RearRight = new Tire_Kumho("�Ĺ� ������", 15);
			break;
		default : 
			break;
		}
	}
	
	void stop() {
		System.out.println("!!!!!!!!!!![�����մϴ�]!!!!!!!!!!!");
	}
}
