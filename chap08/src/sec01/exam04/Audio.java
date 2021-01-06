package sec01.exam04;

public class Audio implements RemoteControl{
	private int Volume;
	public void turnOn() {System.out.println("오디오를 킵니다.");}
	public void turnOff() {System.out.println("오디오를 끕니다.");}
	public void setVolume(int Volume) {
		if(Volume > RemoteControl.MAX_VOLUME) {this.Volume = RemoteControl.MAX_VOLUME;}
		else if(Volume < RemoteControl.MIN_VOLUME) {this.Volume = RemoteControl.MIN_VOLUME;}
		else {this.Volume = Volume;}
		System.out.println("오디오 볼륨 : " + this.Volume);
		}
}
