package sec01.exam04;

public class SmartTelevision implements RemoteControl, WebSearch{
	private int Volume;
	//RemoteControl �������̽��� �߻�޼ҵ��
	public void turnOn() {System.out.println("����Ʈ �ڷ������� ŵ�ϴ�.");}
	public void turnOff() {System.out.println("����Ʈ �ڷ������� ���ϴ�.");}
	public void setVolume(int Volume) {
		if(Volume > RemoteControl.MAX_VOLUME) {this.Volume = RemoteControl.MAX_VOLUME;}
		else if(Volume < RemoteControl.MIN_VOLUME) {this.Volume = RemoteControl.MIN_VOLUME;}
		else {this.Volume = Volume;}
		System.out.println("����Ʈ �ڷ����� ���� : " + this.Volume);
		}
	//WebSearch �������̽��� �߻�޼ҵ�
	public void search(String url) {
		System.out.println(url);
	}
}
