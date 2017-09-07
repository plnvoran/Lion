package Lion;

import java.util.Scanner;

import Lion.Behavior.Behavior;
import Lion.Data.Lion;
import Lion.Logic.Parts;

public class Game {

	public static void main(String[] args) {
		
		Parts parts = new Parts ();
		Lion lion=new Lion();
		Behavior behavior = new Behavior();
		Scanner sc = new Scanner(System.in); 

		parts.messageForStart();
		lion.setState(parts.setStartState(sc));
		
		for (int i=5; i>0; i--)
		{
		
		parts.messageForGetInput(i);					
		
		parts.printResults(behavior.behavior(parts.getInput(sc), lion));
		
		}
		parts.end();
	}
}
