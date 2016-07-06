import java.util.*;
import java.io.*;
public class TextGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String warrior, weapon, name, direction, action;
		char input;
		System.out.println("Hello, choose your warrior: Elf, Dwarf or Human ");
		warrior = scan.nextLine();
		System.out.println("You chose: "+ warrior +" What is their name?");
		name = scan.nextLine();
		System.out.println("Choose your weapon: Ax, Sword, Bow");
		weapon = scan.nextLine();
		System.out.println("You chose to be a " + warrior +", named "+name+" using a "+weapon+". Let the quest for the Grail begin! Good Luck...");
		System.out.println("You reach a path, choose your direction. Left? or Right?");
		direction = scan.nextLine();
		if((direction.equalsIgnoreCase("left"))==true){
			System.out.println("As you take the left path you see a figure up ahead, covered head to toe in black armour. What do you do? Attack or Talk: ");
			action = scan.nextLine();
			if((action.equalsIgnoreCase("attack"))==true){
				System.out.println("You approach the dark knight and attack them with your"+weapon);
				if((weapon.equalsIgnoreCase("ax")||weapon.equalsIgnoreCase("sword"))==true){
					System.out.println("You approach the dark knight, as you do so you take a swing at the left side of his neck"
							+ " he quickly parrys your assault and stabs you through the heart. Your quest is over");
				}
				if((weapon.equalsIgnoreCase("bow"))==true){
					System.out.println("You quickly pull an arrow from your quiver and deliver a kill shot, right between the knights eyes. As you search \n"
							+ "his body you find on his person a key. Ahead you see a fork in the road. Which way will you go? Left? or Right?");
					direction = scan.nextLine();
					if((direction.equalsIgnoreCase("left"))==true){
						System.out.println("Unfortunately there was a band of robbers just around the corner who killed you and left you in the\n"
								+ " middle of the road. You Lose.");
					}
					direction = scan.nextLine();
					if((direction.equalsIgnoreCase("right"))==true){
						System.out.println("in the distance you see a castle. Go? or Give up?");
						if((action.equalsIgnoreCase("Go"))==true){
							System.out.println("You proceed to the castle. As you approach the castle, the drawbridge is released and you enter slowly... As you cross \n"
									+ "the drawbridge and enter the courtyard the drawbridge immediately closes behind you. The Red Knight appears and draws his sword as \n"
									+ "you approach. You draw your "+weapon+ ", and approach. He starts running towards you, sword in the air. You draw back an arrow and catch\n"
											+ " him between the eyes. you walk past the body into the main hall and see \n"
													+ "the chest. You insert the key and retrieve the Grail. Congratulations, you WIN!!!");
							
						}
						else
							System.out.println("You gave up, you are a failure.");
					}	
				}
			}
			if((action.equalsIgnoreCase("talk"))==true){
				System.out.println("You approach the dark knight, he lifts his sword to your chest. You tell him of your quest for the Grail. He tells you that there is \n"
						+ "a castle up ahead that houses the red knight who protects the grail. He tells you not to go because the Red Knight has never been defeated. \n"
						+ "He tells you if you go he will give you the key to the chest that contains the Grail: \n"
						+ "Go? Or Give up?");
				action = scan.nextLine();
				if((action.equalsIgnoreCase("Go"))==true){
					System.out.println("You proceed to the castle. As you approach the castle, the drawbridge is released and you enter slowly... As you cross \n"
							+ "the drawbridge and enter the courtyard the drawbridge immediately closes behind you. The Red Knight appears and draws his sword as \n"
							+ "you approach. You draw your "+weapon+ ", and approach. You circle eachother slowly. He makes the first move and you parry it away. \n"
									+ "Then with a quick counterattack you catch him under the chin with your "+weapon+" you walk pass him into the main hall and see \n"
											+ "the chest. You insert the key and retrieve the Grail. Congratulations, you WIN!!!");
					
				}
				else
					System.out.println("You gave up, you are a failure.");
			}
		}
		if((direction.equalsIgnoreCase("right"))==true){
			System.out.println("As you take the right path a man approaches you. As you are passing him he stops to talk to you. As you turn to talk to him \n"
					+ "someone comes up behind you and stabs you through the back. Sorry you failed.");	
		}
	}

}
