import java.util.Scanner;

public class part3 {

	public void partthree() {
		
		System.out.println("You hear glass break in your kitchen");
		System.out.println("(1) You go see what it was       (2) You call the police");
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println(" ");
		
		part4 part = new part4();
		
		if (a == 1) {
			part.partfour();
		}
		
		else if (a == 2) {
			part.part4v2();
		}
		
		
	}
	
	public void part3v2() {
		
		System.out.println("You stumble across a broken window in your kitchen and hear large footsteps outside");
		System.out.println("(1) Grab your quidditch broom and chase the bastard       (2) Jump head first out the window and embrace the sweet kiss of death");
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println(" ");
		part5 part = new part5();

		if (a == 1) {
			part.partfive();
		}
		
		else if (a == 2) {
			System.out.println("You die and the world dies with you");
			System.out.println(" ");
			System.out.println("THANKS FOR PLAYING");
		}
	}
}
