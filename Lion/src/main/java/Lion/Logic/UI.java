package Lion.Logic;

import java.util.Scanner;

import Lion.Data.Lion;

public class UI {

	public void startMsg() {
		System.out.println("Game The Lion's started. ");

	}

	public void inputStateMsg(int i) {

		System.out.println("You have " + i + " time(s) for playing");
		System.out.println("Type the lion's state in the begining of the game and press Enter");
		System.out.println("Satisfied - press s, Hungry: - press h: ");
	}

	public Lion inputState(Scanner sc, Lion lion) {

		String line = sc.nextLine();

		if (line.equals("h") | line.equals("s") | line.equals("q")) {

			lion.setState(line);
			lion.setError("");
		} 
		
		else {

			lion.setError("Wrong Input!");
		}

		return lion;

	}

	public Lion inputState(String line, Lion lion) {

		if (line.equals("h") | line.equals("s")) {

			lion.setState(line);
			lion.setError("");
		} else {

			lion.setError("Wrong Input!");
		}

		return lion;

	}

	public void printStateResult(Lion lion) {

		if (lion.getError().equals("") && ! lion.getState().equals("q")) {

			System.out.println("Lion's state is:");
			System.out.println(printLong(lion.getState()));

		} else if(!lion.getState().equals("q"))  {
			System.out.println(lion.getError());
		}
	}

	

	public void inputOutsideMsg(int i) {
		System.out.println("You have " + i + " time(s) for playing");
		System.out.println("Set what is happenning in the jungle, hanter is coming or antilope is running.");
		System.out.println("For Antilope - press a, for Hanter: - press h:");
	}

	public String inputOutside(Scanner sc) {

		String line = sc.nextLine();

		if (!line.equals("h") && !line.equals("a")) {

			line = "Wrong Input!";
		}

		return line;

	}

	public void printOutsideResults(Lion lion) {

		if (lion.getError().equals("")) {

			System.out.println("Lion's action is:");
			System.out.println(lion.getAction());
			System.out.println(lion.getMsg());
			System.out.println(printLong(lion.getState()));

		} else {
			System.out.println(lion.getError());
		}
	}

	public String printLong(String state) {

		String stateLong = "";

		switch (state) {
		case "h":
			stateLong = "Hungry";
			break;
		case "s":
			stateLong = "Satisfied";
			break;

		}

		return stateLong;
	}
	
	public void endMsg() {

		System.out.println("####   END   ####");

	}
}
