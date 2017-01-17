package MultiThreading;

public class Threadq extends Thread
{
	public void run()
	{
		
	}
	
	public  static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getPriority());
		Threadq t = new Threadq();
		t.start();
		System.out.println(("Thread from main"+Thread.currentThread().getName()));
		
	}
}

