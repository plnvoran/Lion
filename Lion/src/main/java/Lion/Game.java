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
			ui.inputState(sc, lion);
			ui.printStateResult(lion);
			if (lion.getError().equals("")) break;

		}

		for (int i = 5; i > 0; i--) {

			if (!lion.getState().equals("")) {

				ui.inputOutsideMsg(i);
				behavior.behavior(ui.inputOutside(sc), lion);
				ui.printOutsideResults(lion);

			}

		}

		ui.endMsg();
	}
}
