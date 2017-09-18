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
			
			ui.printStateResult(ui.inputState(sc, lion));
			if (lion.getError().equals("")) break;

			
		}

		for (int i = 5; i > 0; i--) {

			if (!lion.getState().equals("") && !lion.getState().equals("q") ) {

				ui.inputOutsideMsg(i);
				ui.printOutsideResults(behavior.behavior(ui.inputOutside(sc), lion));

			}

		}

		ui.endMsg();
	}
}
