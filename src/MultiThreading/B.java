package MultiThreading;

public class B 
{
	public synchronized void d2(A a)
	{
		System.out.println("Thread 2 starts execution of d2() method");
		try
		{
			Thread.sleep(200);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("Thread 2 trying to call A's last() method");
		a.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside B, This is the last() method");
	}
}
