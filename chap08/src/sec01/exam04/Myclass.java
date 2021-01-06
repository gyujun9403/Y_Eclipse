package sec01.exam04;

public class Myclass {
	//�ڵ� �� ��ȯ(�Ű������� ������).
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
			//���� Ÿ�� ��ȯ.
			SmartTelevision ST = (SmartTelevision) re;
			ST.search(url);
			return;
		}
		else {
			System.out.println("�ش� ���δ� �� Ž���� �� �� �����ϴ�.");
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
		//�Ű������� �������� Ȯ���� �� �ִ�.
		RemoteWebSearch(ST, "www.naver.com");
	}

}
