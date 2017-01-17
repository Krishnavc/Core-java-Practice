package MultiThreading;

public class Threadp extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hi, This is Child thread");
			try
			{
				Thread.sleep(2000,2);
			}
			catch(Exception e)
			{
				System.out.println("Found Exception");
			}
		}
	}
	
	public static void main(String[] args)
	{
		Threadp t = new Threadp();
		t.start();

		for(int i=0;i<10;i++)
		{
			System.out.println("Hi, This is Main thread");
		}
	}
}

