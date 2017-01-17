package MultiThreading;
/* Each thread starts in a separate call stack.
Invoking the run() method from main thread, the run() method goes onto the current call stack rather than at the beginning of a new call stack.
*/
public class TestCallRun1
{ 
	 public void run()
	 {  
		 for(int i=1;i<=3;i++)
			 System.out.println("running...");  
	 }  
	 public static void main(String args[])
	 {  
		 TestCallRun1 t1=new TestCallRun1();  
		 t1.run();                      //fine, but does not start a separate call stack 
		 for(int i=1;i<=2;i++)
			 System.out.println("Main");
	 }  
}  

