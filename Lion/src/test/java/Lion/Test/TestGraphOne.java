package Lion.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Lion.Behavior.Behavior;
import Lion.Data.Lion;

public class TestGraphOne {
  @Test
  public void startFromHungry() {

		Behavior b = new 	Behavior ();
		Lion l = new Lion().withState("h");	
		Lion etalon = new Lion();
		
		etalon.withStatePrevious("h").withState("h").withAction("Run").withMsg("Lion state has not been changed and now is:");
		Assert.assertEquals(b.behavior("h", l), etalon);
	
	}
}
