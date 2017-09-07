package Lion.Logic;

import java.util.Scanner;

import Lion.Data.Lion;

public class Parts {

	public void messageForStart() {
		System.out.println("Game The Lion's started. ");
		System.out.println("You have 5 times fo plaing");
		System.out.println("Type the lion's state in the begining of the game and press Enter");
		System.out.println("Satisfied - press s, Hungry: - press h: ");
	}

	public String setStartState(Scanner sc) {
		
		String line = sc.nextLine();
		
		return line;

	}

	public void messageForGetInput(int i) {
		System.out.println("You have " + i + " time(s) for playing");
		System.out.println("Set what is happenning in the jungle, hanter is coming or antilope is running.");
		System.out.println("For Antilope - press a, for Hanter: - press h:");
	}

	public String getInput(Scanner sc) {
		String line = "";
		line = sc.nextLine();
		return line;

	}

	public void printResults(Lion lion) {

		System.out.println("Lion's action is:");
		System.out.println(lion.getAction());
		System.out.println(lion.getMsg());
		System.out.println(lion.getState());

	}

	public void end() {

		System.out.println("####   END   ####");

	}
}
