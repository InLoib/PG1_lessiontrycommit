package Übung1;

public class b_RechnenArithmetik {
	
	public static void main(String[] args) {
		// üben der mathematischen Übungen.

		int a = 9;
		int b = 5;

		int resultmodulo = (a % b);
		int resultdivert = (a / b);

		/* erste Variante, wo die Rechnung direkt integriert ist im Outprint: */
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));

		/*
		 * zweite Variante, wo die Rechnung vorab oben stattfindet und hier nur
		 * als Wert eingegeben ist.
		 */
		System.out.println(a + " / " + b + " = " + resultdivert);
		System.out.println(a + " % " + b + " = " + resultmodulo);

				
	}


}
