package sec01.exam05;

/*
 * A_Super은 final 클래스 이므로 상속받을수 없다. 
 * public class C extends A_Super{}
 * → The type C cannot subclass the final class A_Super
 */
public class C extends B_Super{
	
	/*
	 * B_Super의 func1는 final메소드이므로 재정의 할 수 없다. 
	 *@Override
	 *public void func1(){}
	 *→ Cannot override the final method from B_Super
 	 */
	
}
