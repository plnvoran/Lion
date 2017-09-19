package Lion.Behavior;

import Lion.Data.Lion;

public class Behavior {

	public Lion behavior(String input, Lion lion) {

		if (input.equals("h") | input.equals("a") | input.equals("q")) {

			if (input.equals("h")) {

				lion.setError("");

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

				lion.setError("");

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
			else if (input.equals("q")) 
			{
				lion.setIsQuit(true);
			}

			if (lion.getState().equals(lion.getStatePrevious()) && lion.getIsQuit().equals(false)) {
				lion.setMsg("Lion state has not been changed and now is:");
			} else if (lion.getIsQuit()) {
				lion.setMsg("User brake");
			}

			else {
				lion.setMsg("Lion state has been changed to:");
			}
		}

		else {
			lion.setError("Wrong Input!");
		}

		return lion;
	}

}
