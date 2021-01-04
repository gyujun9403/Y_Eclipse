package sec02.exam03;

public class Car {
	//Tire 클래스는 이 클래스의 부품으로서 사용된다.
	Tire FontLetf = new Tire("전방 왼쪽", 10);
	Tire FontRight = new Tire("전방 오른쪽", 5);
	Tire RearLetf = new Tire("후방 왼쪽", 3);
	Tire RearRight = new Tire("후방 오른쪽", 8);
	
	//주행. 주행마다 내구도 감소. 터진 타이어 번호 반환
	void run(){
		System.out.println("\n");
		System.out.println("-------------주행 중-------------");
		if(FontLetf.roll() == false) { stop(); changeTire(1); }
		if(FontRight.roll() == false) { stop(); changeTire(2);}
		if(RearLetf.roll() == false) { stop(); changeTire(3);}
		if(RearRight.roll() == false) { stop(); changeTire(4);}
	}
	
	void changeTire(int num) {
		switch(num) {
		case 1 :
			System.out.println("전방 왼쪽 바퀴를 Hankook타이어로 교체합니다.");
			this.FontLetf = new Tire_Hankook("전방 왼쪽", 15);
			break;
		case 2 :
			System.out.println("전방 오른쪽 바퀴를 Hankook타이어로 교체합니다.");
			this.FontRight = new Tire_Hankook("전방 오른쪽", 15);
			break;
		case 3 :
			System.out.println("후방 왼쪽 바퀴를 Kumho타이어로 교체합니다.");
			this.RearLetf = new Tire_Kumho("후방 왼쪽", 15);
			break;
		case 4 :
			System.out.println("후방 오른쪽 바퀴를 Kumho타이어로 교체합니다.");
			this.RearRight = new Tire_Kumho("후방 오른쪽", 15);
			break;
		default : 
			break;
		}
	}
	
	void stop() {
		System.out.println("!!!!!!!!!!![정차합니다]!!!!!!!!!!!");
	}
}
