package Encapsulation;

public class Main {
	public static void main(String[] args){
		Address a1 = new Address();
		Address a2 = new Address();
		a1.setZipcode(75420);
		a1.setCity("Dallas");
		a1.setState("Texas");
		System.out.println("zipcode: " + a1.getZipcode() + "\nCity: " + a1.getCity() + "\nState: " + a1.getState());
		a2.setZipcode(75024);
		a2.setCity("Plano");
		a2.setState("Newjersey");
		System.out.println("\nzipcode: " + a2.getZipcode() + "\nCity: " + a2.getCity() + "\nState: " + a2.getState());
	}
}
/*public class Main{
	public static void main(String[] args){
		Address a1 = new Address();
		Address a2 = new Address(75024, "plano", 521);
	}
}	*/