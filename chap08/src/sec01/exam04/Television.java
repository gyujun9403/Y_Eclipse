package sec01.exam04;

public class Television implements RemoteControl{
	private int Volume;
	public void turnOn() {System.out.println("텔레비전을 킵니다.");}
	public void turnOff() {System.out.println("텔레비전을 끕니다.");}
	public void setVolume(int Volume) {
		if(Volume > RemoteControl.MAX_VOLUME) {this.Volume = RemoteControl.MAX_VOLUME;}
		else if(Volume < RemoteControl.MIN_VOLUME) {this.Volume = RemoteControl.MIN_VOLUME;}
		else {this.Volume = Volume;}
		System.out.println("텔레비전 볼륨 : " + this.Volume);
		}
}
