package Lion.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Lion.Behavior.Behavior;
import Lion.Data.Lion;

public class TestWithDP {

	Behavior b = new Behavior();
	Lion l = new Lion();
	Lion etalon = new Lion();

	static String isChanged = "Lion state has been changed to:";
	static String isNotChanged = "Lion state has not been changed and now is:";
	static String empty = "";
	static String wrong="mungust";
	static String error="Wrong Input!";

	@BeforeTest
	public void setFirstPiont() {

		l.withState("h");
	}
	
	@DataProvider(name = "Graph")

	public static String[][] graph() {

		String[][] arr = new String[3][6];

		arr[0][0] = "h";
		arr[0][1] = "h";
		arr[0][2] = "h";
		arr[0][3] = "Run";
		arr[0][4] = isNotChanged;
		arr[0][5] = empty;

		arr[1][0] = "a";
		arr[1][1] = "h";
		arr[1][2] = "s";
		arr[1][3] = "Eat";
		arr[1][4] = isChanged;
		arr[1][5] = empty;
		
		arr[2][0] = wrong;
		arr[2][1] = "h";
		arr[2][2] = "s";
		arr[2][3] = "Eat";
		arr[2][4] = isChanged;
		arr[2][5] = error;
		
		return arr;

	}	

	@Test(dataProvider = "Graph")
	public void testLionObj(String iuput, String statePrevious, String state, String action, String msg, String error) {

	
		etalon.withStatePrevious(statePrevious).withState(state).withAction( action).withMsg(msg).withError(error);

		Assert.assertEquals(b.behavior(iuput, l), etalon);

	}
}
