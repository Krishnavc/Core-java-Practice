package MultiThreading;
/*The Thread class provides methods to change and get the name of a thread. 
 * By default, each thread has a name i.e. thread-0, thread-1 and so on. 
 * By we can change the name of the thread by using setName() method.
 */
public class TestMultiNaming1 extends Thread
{
	public void run()
	{  
		System.out.println("running...");  
	}  
	public static void main(String args[])
	{  
		  TestMultiNaming1 t1=new TestMultiNaming1();  
		  TestMultiNaming1 t2=new TestMultiNaming1();  
		  System.out.println("Name of t1:"+t1.getName());  
		  System.out.println("Name of t2:"+t2.getName());  
		  t1.start();  
		  t2.start();  
		  t1.setName("Sonoo Jaiswal");  
		  System.out.println("After changing name of t1:"+t1.getName());
		  t2.setName("kv");
		  System.out.println("After changing name of t2:" +t2.getName());
	}  
}
