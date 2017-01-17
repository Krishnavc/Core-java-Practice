package MultiThreading;

public  class A
{
	public synchronized void d1(B b)
	{
		System.out.println("Thread 1 starts execution of d1() method");
		try
		{
			Thread.sleep(400);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("Thread 1 trying to call B's last() method");
		b.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside A, This is last() method");
	}
}

