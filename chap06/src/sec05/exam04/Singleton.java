package sec05.exam04;

public class Singleton {
	//private는 접근 권한 때문에 외부에서 접근 불가.
	private static Singleton singleton = new Singleton();
	private Singleton() {}
	
	static Singleton getInstance() {
		//객체를 만들 수 없으므로 객체의 주소를 리턴하여 사용.
		return singleton;
	}
}
