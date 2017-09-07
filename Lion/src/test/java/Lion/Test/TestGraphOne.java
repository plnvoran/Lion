package Lion.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Lion.Behavior.Behavior;
import Lion.Data.Lion;

public class TestGraphOne {

	Behavior b = new Behavior();
	Lion l = new Lion();
	Lion etalon = new Lion();
	
	String isChanged="Lion state has been changed to:";
	String isNotChanged="Lion state has not been changed and now is:";
	

	@Test (priority=1)
	public void hungryToHungryByHanter() {

		l.withState("h");
		etalon.withStatePrevious("h").withState("h").withAction("Run").withMsg(isNotChanged);

		Assert.assertEquals(b.behavior("h", l), etalon);

	}

	@Test (priority=2)
	public void hungryToSatisfiteByAntilope() {

		etalon.withStatePrevious("h").withState("s").withAction("Eat").withMsg(isChanged);

		Assert.assertEquals(b.behavior("a", l), etalon);

	}
	
	@Test (priority=3)
	public void satisfiteToHungryByHanter() {

		etalon.withStatePrevious("s").withState("h").withAction("Run").withMsg(isChanged);

		Assert.assertEquals(b.behavior("h", l), etalon);

	}
	
	@Test (priority=4)
	public void hungryToSatisfiteByAntilopeAgain() {

		etalon.withStatePrevious("h").withState("s").withAction("Eat").withMsg(isChanged);

		Assert.assertEquals(b.behavior("a", l), etalon);

	}
	
	@Test (priority=5)
	public void satisfiteToHungryByAntilope() {

		etalon.withStatePrevious("s").withState("h").withAction("Sleep").withMsg(isChanged);

		Assert.assertEquals(b.behavior("a", l), etalon);

	}
}
