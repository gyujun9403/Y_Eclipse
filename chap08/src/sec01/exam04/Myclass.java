package sec01.exam04;

public class Myclass {
	//자동 형 변환(매개변수의 다형성).
	public static void RemoteOnButton(RemoteControl re) {
		re.turnOn();
		}
	public static void RemoteOffButton(RemoteControl re){
		re.turnOff();
		}
	public static void RemoteVolumeSet(RemoteControl re, int Volume){
		re.setVolume(Volume);
		}
	public static void RemoteWebSearch(RemoteControl re, String url) {
		if(re instanceof SmartTelevision) {
			//강제 타입 변환.
			SmartTelevision ST = (SmartTelevision) re;
			ST.search(url);
			return;
		}
		else {
			System.out.println("해당 기기로는 웹 탐색을 할 수 없습니다.");
		}
	}
	
	public static void main(String[] args) {
		Television Tv = new Television();
		Audio audio = new Audio();
		SmartTelevision ST = new SmartTelevision();
		System.out.println("--------[TV]--------");
		RemoteOnButton(Tv);
		RemoteOffButton(Tv);
		RemoteVolumeSet(Tv, 7);
		RemoteWebSearch(Tv, "www.naver.com");
		System.out.println("------[Audio]------");
		RemoteOnButton(audio);
		RemoteOffButton(audio);
		RemoteVolumeSet(audio, -3);
		RemoteWebSearch(audio, "www.naver.com");
		System.out.println("-----[Smart TV]-----");
		RemoteOnButton(ST);
		RemoteOffButton(ST);
		RemoteVolumeSet(ST, 14);
		//매개변수의 다형성을 확인할 수 있다.
		RemoteWebSearch(ST, "www.naver.com");
	}

}
