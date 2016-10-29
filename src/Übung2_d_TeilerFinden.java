
public class Übung2_d_TeilerFinden {

	public static void main(String[] args) {

		int zahl = 16;
		int teiler = 2;
		
				
			while (zahl > teiler) {
				if (zahl % teiler == 0) {
					System.out.println("teiler "+teiler+" gefunden");
				}
			
				teiler++;
		}
		

	}

}
