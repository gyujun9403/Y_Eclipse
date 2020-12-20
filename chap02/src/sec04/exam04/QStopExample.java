package sec04.exam04;

public class QStopExample {

	public static void main(String[] args) throws Exception{
		int KeyCode;
		
		while(true) {
			KeyCode = System.in.read();
			System.out.println("KeyCod : " + KeyCode);
			if(KeyCode == 113) {break;}
			
		}
		
		System.out.println("Á¾·á");
	}

}
