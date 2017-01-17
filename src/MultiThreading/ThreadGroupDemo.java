package MultiThreading;

public class ThreadGroupDemo implements Runnable
{
	public void run()
	{  
        System.out.println(Thread.currentThread().getName());  
	}  
	public static void main(String[] args) 
	{  
	 	ThreadGroupDemo runnable = new ThreadGroupDemo();  
        ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");  
          
        Thread t1 = new Thread(tg1, runnable,"one");  
        t1.start();  
        Thread t2 = new Thread(tg1, runnable,"two");  
        t2.start();  
        Thread t3 = new Thread(tg1, runnable,"three");  
        t3.start();  
             
        System.out.println("Thread Group Name: "+tg1.getName());  
        tg1.list();  
	}  
}

/*ThreadGroup tg1 = new ThreadGroup("Group A");   
Thread t1 = new Thread(tg1,new MyRunnable(),"one");     
Thread t2 = new Thread(tg1,new MyRunnable(),"two");     
Thread t3 = new Thread(tg1,new MyRunnable(),"three");    

Now all 3 threads belong to one group. Here, tg1 is the thread group name, MyRunnable is the class that implements Runnable interface and "one", "two" and "three" are the thread names.

Now we can interrupt all threads by a single line of code only.

Thread.currentThread().getThreadGroup().interrupt();  
*/