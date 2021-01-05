package sec03.exam01;

public abstract class Phone {
	public String owner;
	public Phone(String owner) {this.owner = owner;}
	 
	public void on() {System.out.println("전원을 킵니다.");}
	public void off() {System.out.println("전원을 끕니다.");}
}
;