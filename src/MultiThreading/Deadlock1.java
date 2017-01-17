package MultiThreading;

public class Deadlock1 extends Thread
{
	A a = new A();
	B b = new B();
	public void m1()
	{
		this.start();
		a.d1(b); // Executed by Main Thread
	}
	public void run()
	{
		b.d2(a);
	}
	public static void main(String[] args)
	{
		Deadlock1 d = new Deadlock1();
		d.m1();
	}

}
