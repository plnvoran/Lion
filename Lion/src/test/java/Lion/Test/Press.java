package Lion.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Press {
  @Test
  public void f() throws AWTException {
		Scanner sc = new Scanner(System.in);
		
	  Robot r = new Robot(); 
 	  
	 
 	
	  r.keyPress(57);
	  r.keyRelease(57);
	  r.keyPress(KeyEvent.VK_ENTER); 
	  r.keyRelease(KeyEvent.VK_ENTER);
	  
	  
	  String line = sc.nextLine();
	 
	  
 	  System.out.println(line);
 	  
  }
}


