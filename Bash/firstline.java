import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pinger {
public static void main(String[] args) {
       	Process p;
	try {
		//new String[] {"bin/bash","-c","echo password| sudo -S ls"},
		String[] cmd = {"bin/bash","-c","echo password| sudo -S ls"};
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
