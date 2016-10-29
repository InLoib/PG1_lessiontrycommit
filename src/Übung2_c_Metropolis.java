
public class Übung2_c_Metropolis {

	public static void main(String[] args) {

		boolean result = isMetropolis(true, 1_000, 100);
		if(result){
			System.out.println("Diese Stadt ist eine Metropole");
		}
		else {
			System.out.println("Diese Stadt ist uncool");
		}
					
		
	}
		public static boolean isMetropolis (boolean isCapital, int inhabitants, double taxPerPersonAndMonth) {

			
			double taxes = inhabitants * taxPerPersonAndMonth * 12;
			
		if (inhabitants >100_000 && isCapital == true
		 || inhabitants >200_000 && taxes > 720_000_000) {
		 return true;
		}
		 else {
			 return false;
		 }
	}

}
