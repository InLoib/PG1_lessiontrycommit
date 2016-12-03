package b_socialMedia_Demo;

public class b_MayBe<T> {

	private T data;
	private int status;
	
	public T getData(){
		return data;
	}
		
	public int getStatus(){
		return status;
	}
		
	public b_MayBe(T data, int status) {
		super();
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


