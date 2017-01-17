package Constructor;

public class Address 
{
		int zip;
		String city;
		int dno;
		Address()
		{
			zip=75024;
			city="dallas";
			dno=123;
		}
		Address(int zip, String city, int dno)
		{
			this.zip=zip;
			this.city=city;
			this.dno=dno;
		}
	    public void display()
	    {
	 		System.out.println("ADDRESS:- \n Zip : "+zip+"\n City : "+city+"\n DoorNo. : "+dno);
		}

		public static void main(String[] args)
		{
			Address a1 = new Address();
			Address a2 = new Address(75024, "plano", 521);
			a1.display();
			a2.display();
	    }
}


