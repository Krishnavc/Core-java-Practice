package MultiThreading;

public class TestDaemonThread2 extends Thread
{
	public void run()
	{
		System.out.println("Name: "+Thread.currentThread().getName());
		System.out.println("Daemon: "+Thread.currentThread().getName());
		/*if(Thread.currentThread().isDaemon())
		{
			char[] getDaemon = null;
			System.out.println(getDaemon);
		}
		else
		{
			System.out.println("user thread work");
		}*/
	}	
	public static void main(String[] args)
	{  
		TestDaemonThread2 t1=new TestDaemonThread2();
		TestDaemonThread2 t2=new TestDaemonThread2();
		t1.start();  
		t1.setDaemon(true);//will throw exception here  
		//t2.setDaemon(true);
		t2.start(); 
	} 
}
