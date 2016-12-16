package b_socialMedia_Demo;

public class b_MayBeInt {

	private int data;
	private int status;
	
	public int getStatus() {
		return status;
	}

	public int getData() {
		return data;
	}

	public b_MayBeInt (int data, int status) {
		this.data = data;
		this.status = status;
	}
	
	public void print() {
		switch (status) {
		case 1: 
			System.out.println("Zugriff gestattet: " + data);
			break;
		case 2: 
			System.out.println("Zugriff nicht gestattet");
			break;
		case 3:
			System.out.println("Nicht erfasst!");
			break;
		default:
			System.out.println("Ungültiger Status!!");
			break;
		}
	}
	
}