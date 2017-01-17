package MultiThreading;
/*Default priority of a thread is 5 (NORM_PRIORITY). The value of MIN_PRIORITY is 1 and 
 * the value of MAX_PRIORITY is 10.
*/
public class TestMultiPriority1 extends Thread
{
	public void run()
	{  
		System.out.println("running thread name is:"+Thread.currentThread().getName());  
		System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
	}  
	public static void main(String args[])
	{  
		TestMultiPriority1 m1=new TestMultiPriority1();  
		TestMultiPriority1 m2=new TestMultiPriority1();  
		m1.setPriority(Thread.MIN_PRIORITY);  
		m2.setPriority(Thread.MAX_PRIORITY);  
		m1.start();  
		m2.start();  
	}  
}
