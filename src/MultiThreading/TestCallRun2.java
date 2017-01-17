package MultiThreading;
/*As you can see in the program that there is no context-switching because 
 * here t1 and t2 will be treated as normal object not thread object.
*/
public class TestCallRun2
{  
	public void run()
	{  
		for(int i=1;i<7;i++)
		{  
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}  
			System.out.println(i);  
		} 
	}
	public static void main(String args[]){  
		TestCallRun2 t1=new TestCallRun2();  
		TestCallRun2 t2=new TestCallRun2();  
		t1.run();  
		t2.run();  
	 }  
}  

