package Lion;

import java.util.Scanner;

import Lion.Behavior.Behavior;
import Lion.Data.Lion;
import Lion.Logic.UI;

public class Game {

	public static void main(String[] args) {

		UI ui = new UI();
		Lion lion = new Lion();
		Behavior behavior = new Behavior();
		Scanner sc = new Scanner(System.in);

		ui.startMsg();

		for (int i = 5; i > 0; i--) {

			ui.inputStateMsg(i);

			lion = ui.inputState(sc, lion);
			ui.printStateResult(lion);

			if (lion.getError().equals("") | lion.getQuit().equals("q"))
				break;

		}

		for (int i = 5; i > 0; i--) {

			if (!lion.getState().equals("") && !lion.getQuit().equals("q")) {

				ui.inputOutsideMsg(i);

				if (!behavior.behavior(ui.inputOutside(sc), lion).getQuit().equals("q")) {
					ui.printOutsideResults(lion);
				}

			}

		}

		ui.endMsg();
	}
}
