package sec01.exam04;

public class SmartTelevision implements RemoteControl, WebSearch{
	private int Volume;
	//RemoteControl 인터페이스의 추상메소드들
	public void turnOn() {System.out.println("스마트 텔레비전을 킵니다.");}
	public void turnOff() {System.out.println("스마트 텔레비전을 끕니다.");}
	public void setVolume(int Volume) {
		if(Volume > RemoteControl.MAX_VOLUME) {this.Volume = RemoteControl.MAX_VOLUME;}
		else if(Volume < RemoteControl.MIN_VOLUME) {this.Volume = RemoteControl.MIN_VOLUME;}
		else {this.Volume = Volume;}
		System.out.println("스마트 텔레비전 볼륨 : " + this.Volume);
		}
	//WebSearch 인터페이스의 추상메소드
	public void search(String url) {
		System.out.println(url);
	}
}
