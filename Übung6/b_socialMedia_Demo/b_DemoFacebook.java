package b_socialMedia_Demo;

public class b_DemoFacebook {

	public static void main(String[] args) {
		b_MayBeInt alter = new b_MayBeInt (26, 2);
		b_MayBe<String> adresse = new b_MayBe<String> ("Graz", 1);
		
		b_Profil IL = new b_Profil ("In", "Loib", "in.loib@edu.c.at", "single", alter, adresse);
		
		IL.print();
		
	}

}
