package sec01.exam04;

public class Television implements RemoteControl{
	private int Volume;
	public void turnOn() {System.out.println("�ڷ������� ŵ�ϴ�.");}
	public void turnOff() {System.out.println("�ڷ������� ���ϴ�.");}
	public void setVolume(int Volume) {
		if(Volume > RemoteControl.MAX_VOLUME) {this.Volume = RemoteControl.MAX_VOLUME;}
		else if(Volume < RemoteControl.MIN_VOLUME) {this.Volume = RemoteControl.MIN_VOLUME;}
		else {this.Volume = Volume;}
		System.out.println("�ڷ����� ���� : " + this.Volume);
		}
}
