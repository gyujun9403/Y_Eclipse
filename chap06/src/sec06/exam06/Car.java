package sec06.exam06;

public class Car {
	private int speed;
	private boolean stop;
	
	/*
	필드 블럭 -> sourse -> Generate Getter and Setter실행 결과 
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
		//입력된 속도가 0보다 작다면 0을 입력
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
