package Übung5;

public class a_DemoAppBruch {

	public static void main(String[] args) {

		a_Bruch b1 = new a_Bruch (7, 5);
		a_Bruch b2 = new a_Bruch (3 ,4);

		//Leere ertste Zeile mit:
		/*System.out.println();
		*/
		b1.print();
		b2.print();
		
		a_Bruch b3 = b1.multiplicate(b2);
		b3.print();
		
		
		
	}

}
