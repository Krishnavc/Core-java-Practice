package MultiThreading;

public class Argthread extends Thread 
{
	public void run()
	{
		System.out.println("no arg run method");
	}
	public void run(int i)
	{
		System.out.println("arg run method");
	}
}
