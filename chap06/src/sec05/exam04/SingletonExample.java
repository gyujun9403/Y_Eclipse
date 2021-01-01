package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
		//Singleton obj1 = new Singleton(); Singleton is not visible
		//Singleton obj2 = new Singleton(); Singleton is not visible
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("Singleton객체는 단일이다.");
		}
		else {
			System.out.println("Singleton객체는 단일이 아니다.");
		}
	}

}
