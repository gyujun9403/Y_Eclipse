package sec01.exam04;

public class Audio implements RemoteControl{
	private int Volume;
	public void turnOn() {System.out.println("������� ŵ�ϴ�.");}
	public void turnOff() {System.out.println("������� ���ϴ�.");}
	public void setVolume(int Volume) {
		if(Volume > RemoteControl.MAX_VOLUME) {this.Volume = RemoteControl.MAX_VOLUME;}
		else if(Volume < RemoteControl.MIN_VOLUME) {this.Volume = RemoteControl.MIN_VOLUME;}
		else {this.Volume = Volume;}
		System.out.println("����� ���� : " + this.Volume);
		}
}
