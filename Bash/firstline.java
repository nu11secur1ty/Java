//@nu11secur1ty
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class firstline {
public static void main(String[] args) {
       	Process p;
	try {   
		// Executing from script
	      	//String[] cmd = { "sh", "pinger.sh"};
		// Executing in first line 
		String[] cmd = {"/bin/bash","-c","ping -c 4 google.com"};
   		p = Runtime.getRuntime().exec(cmd); 
		p.waitFor(); 
		BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream())); 
		
		String line; 
		while((line = reader.readLine()) != null) { 
			System.out.println(line);
		} 
	
	} catch (IOException e) {
   // TODO Auto-generated catch block
   
		e.printStackTrace();
	
	} catch (InterruptedException e) {
   // TODO Auto-generated catch block
   
	  e.printStackTrace();
   	}
  }
}
