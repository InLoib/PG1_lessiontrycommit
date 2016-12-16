package b_socialMedia_Demo;

public class b_Profil {

	private String vorname;
	private String nachname;
	private String eMail;
	private String beziehungsStatus;
	private b_MayBeInt alter;
	private b_MayBe<String> adresse;
	
	
	public b_Profil (String vorname, String nachname, String eMail, String beziehungsStatus, b_MayBeInt alter, b_MayBe<String> adresse) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.eMail = eMail;
		this.beziehungsStatus = beziehungsStatus;
		this.alter = alter;
		this.adresse = adresse;

	}	
	
	public void print(){
		System.out.println(vorname +" " +nachname);
		System.out.println(eMail);
		System.out.println(beziehungsStatus);
		alter.print();
		adresse.print();
		
	}
}
