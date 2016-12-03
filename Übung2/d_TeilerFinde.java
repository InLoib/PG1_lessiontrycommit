
public class d_TeilerFinde {


	public static void main(String[] args) {

		int zahl = 10;
		int teiler = 2;

		while (zahl > teiler) {
			if (zahl % teiler == 0) {
				System.out.println("teiler " + teiler + " gefunden");
			}

			teiler++;
		}

	}

}
