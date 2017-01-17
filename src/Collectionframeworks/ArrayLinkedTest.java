package Collectionframeworks;
import java.util.*;    
public class ArrayLinkedTest {
	public static void main(String args[]){    
	  List<String> al=new ArrayList<String>();//creating array list    
	  al.add("Ravi");     //adding object in array list    
	  al.add("Vijay");    
	  al.add("Ravi");    
	  al.add("Ajay");    
	    
	  List<String> al2=new LinkedList<String>();//creating linked list    
	  al2.add("James");//adding object in linked list    
	  al2.add("Serena");    
	  al2.add("Swati");    
	  al2.add("Junaid");    
	    
	  System.out.println("arraylist: "+al);  
	  System.out.println("linkedlist: "+al2);  
	}    
    
}
