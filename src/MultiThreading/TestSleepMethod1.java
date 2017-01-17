package MultiThreading;
/* at a time only one thread is executed. 
 * If you sleep a thread for the specified time,
 * the thread shedular picks up another thread and so on.
 * */

public class TestSleepMethod1 extends Thread
{
	public void run()
	{
		for(int i=1;i<7;i++)
		{
			try
			{
				Thread.sleep(40);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		TestSleepMethod1 t = new TestSleepMethod1();
		TestSleepMethod1 t1 = new TestSleepMethod1();
		t.start();
		t1.start();
	}
}