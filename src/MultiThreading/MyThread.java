package MultiThreading;

public class MyThread extends Thread
{
public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("child thread");
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
	
		}
	}

	public static void main(String[] args)
	{
		MyThread t = new MyThread();
		t.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main Thread");
			System.out.println(i);
			try
			{
				Thread.sleep(10);
			}
			catch(Exception e)
			{
				
			}
		}	
	}
}


















