package Lion.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import org.testng.annotations.Test;

import Lion.Data.Lion;
import Lion.Logic.UI;

public class TypeTest {
  @Test
  public void f() throws AWTException {
	  
	  
	  UI ui= new UI();
	  Lion lion=new Lion();
	  Scanner sc = new Scanner(System.in);
	  
	  ui.inputState(sc, lion);
	  String line = sc.nextLine();
	 
	  
	  Robot r = new Robot(); 
	  r.keyPress(57);
	  r.keyPress(KeyEvent.VK_ENTER); 
  }
}
