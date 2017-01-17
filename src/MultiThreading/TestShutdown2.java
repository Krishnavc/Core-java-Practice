package MultiThreading;

public class TestShutdown2 
{ 
		public static void main(String[] args)throws Exception {  
		  
		Runtime r=Runtime.getRuntime();  
		  
		r.addShutdownHook(new Thread(){  
		public void run()
		{  
		    System.out.println("shut down hook task completed..");  
		} 
		}
		);
		System.out.println("Now main sleeping... press ctrl+c to exit");  
		try
		{
			Thread.sleep(3000);
			}
		catch (Exception e) {}  
		}  
}
/*The addShutdownHook() method of Runtime class is used to 
 * register the thread with the Virtual Machine. 
 * Syntax:	public void addShutdownHook(Thread hook){} 
 * 
 *  The object of Runtime class can be obtained by calling the static factory method getRuntime(). For example:
	Runtime r = Runtime.getRuntime();
 */

