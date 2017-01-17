package MultiThreading;
/*Daemon thread in java is a service provider thread that provides services
 *  to the user thread. Its life depend on the mercy of user threads
 *  i.e. when all the user threads dies, JVM terminates this thread automatically.
 */
public class TestDaemonThread1 extends Thread
{
	public void run()
	{  
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon thread work");
		}
		else
		{
			System.out.println("user thread work");
		}
	}  
	public static void main(String[] args){  
		  TestDaemonThread1 t1=new TestDaemonThread1();   //creating thread  
		  TestDaemonThread1 t2=new TestDaemonThread1();  
		  TestDaemonThread1 t3=new TestDaemonThread1();  
		  t3.setDaemon(true);		//now t1 is daemon thread  
		  t1.start();				//starting threads  
		  t2.start();  
		  t3.start();  
		 }  
}
/*The sole purpose of the daemon thread is that 
 * it provides services to user thread for background supporting task. 
 * If there is no user thread, why should JVM keep running this thread. 
 * That is why JVM terminates the daemon thread if there is no user thread.
 */

/*NOTE: If you want to make a user thread as Daemon, 
 * it must not be started otherwise it will throw IllegalThreadStateException.
 */