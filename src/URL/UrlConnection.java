package URL;
import java.io.*;  
import java.net.*; 
public class UrlConnection {
	public static void main(String[] args){  
		try{  
		URL url=new URL("http://www.javatpoint.com/java-tutorial");  
		URLConnection urlcon=url.openConnection();  
		InputStream stream=urlcon.getInputStream();  
		int i;  
		while((i=stream.read())!=-1){  
		System.out.print((char)i);  
		}  
		}catch(Exception e){System.out.println(e);}  
		}  
}
/*getInputStream() method returns all the data of the specified URL in the stream that can be read and displayed.*/