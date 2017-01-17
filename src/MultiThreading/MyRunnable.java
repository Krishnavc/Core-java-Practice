package MultiThreading;

public class MyRunnable implements Runnable
{
	public void run() 
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
			try
			{
				Thread.sleep(4000);
			}
			catch(Exception e)
			{
				System.out.println("Found Exception");
			}
		}
	}
	public static void main(String[] args)
	{
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(" Found Exception");
			}
		}
	}	

}
