package sec05.exam04;

public class Singleton {
	//private�� ���� ���� ������ �ܺο��� ���� �Ұ�.
	private static Singleton singleton = new Singleton();
	private Singleton() {}
	
	static Singleton getInstance() {
		//��ü�� ���� �� �����Ƿ� ��ü�� �ּҸ� �����Ͽ� ���.
		return singleton;
	}
}
