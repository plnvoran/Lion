package Lion.Behavior;

import Lion.Data.Lion;



public class Behavior {

	public Lion behavior(String input, Lion lion) {
		
		
	
		if (input.equals("h")) {

			if (lion.getState().equals("h")) {
				lion.setAction("Run");
				lion.setStatePrevious("h");
				lion.setState("h");
			} else if (lion.getState().equals("s")) {
				lion.setAction("Run");
				lion.setStatePrevious("s");
				lion.setState("h");
			}

		} else if (input.equals("a")) {
			if (lion.getState().equals("h")) {
				lion.setAction("Eat");
				lion.setStatePrevious("h");
				lion.setState("s");
			} else if (lion.getState().equals("s")) {
				lion.setAction("Sleep");
				lion.setStatePrevious("s");
				lion.setState("h");
			}
		}
		

		if (lion.getState().equals(lion.getStatePrevious())) {
			lion.setMsg("Lion state has not been changed and now is:");
		} else {
			lion.setMsg("Lion state has been changed to:");
		}

		return lion;
	}

}
