package sec06.exam06;

public class Car {
	private int speed;
	private boolean stop;
	
	/*
	�ʵ� �� -> sourse -> Generate Getter and Setter���� ��� 
	 public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	 */
	
	public int getSpeed() {return this.speed;}
	public void setSpeed(int speed) {
		//�Էµ� �ӵ��� 0���� �۴ٸ� 0�� �Է�
		if(speed < 0) 
			this.speed = 0;
		else 
			this.speed = speed;
		return;
	}
	
	public boolean isStop() {return this.stop;}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
} 
