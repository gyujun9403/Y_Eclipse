package sec03.exam02;

public abstract class Animal {
	public String kind;
	public Animal(String kind) {this.kind = kind;}
	//모든 하위 클래스에 공통적으로 동작하는 메소드
	public void breath() {System.out.println(this.kind + "가 숨을 쉰다.");}
	//하위 클레스마다 다른 동작 방식을 가지는 메소드는 추상 메소드로.
	public abstract void sound();
}
