package ExceptionHandling;
import java.io.*; 
public class Exception1 {
	class M{  
		 void method()throws IOException{  
		  throw new IOException("device error");  
		 }  
		}  
		
		   public static void main(String args[]){  
		    try{  
		    Exception1 m=new Exception1();  
		     m.method();  
		    }catch(Exception e){System.out.println("exception handled");}     
		  
		    System.out.println("normal flow...");  
		  }

		private void method() {
			// TODO Auto-generated method stub
			
		}  
}
