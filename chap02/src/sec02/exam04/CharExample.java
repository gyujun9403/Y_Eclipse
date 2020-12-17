package sec02.exam04;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A',	c2 = 65, 	c3 = '\u0041';
		char c4 = '°¡', 	c5 = 44032,	c6 = '\uac00';
		
		System.out.println("'A'   : " + c1);
		System.out.println("65    : " + c2);
		System.out.println("\\u0041: " + c3 + "\n");
		
		System.out.println("'°¡'    : " + c4);
		System.out.println("44032  : " + c5);
		System.out.println("\\uac00': " + c6);
				
	}
}
