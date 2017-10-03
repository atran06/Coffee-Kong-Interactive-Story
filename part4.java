import java.util.Scanner;

public class part4 {

	public void partfour() {
		
		System.out.println("You find your window broken... but you live on the 12th floor");
		System.out.println("(1) Grab your quidditch broom and chase the bastard       (2) Jump head first out the window and embrace the sweet kiss of death");
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println(" ");
		part5 part = new part5();
		part6 part1 = new part6();
		
		if(a == 1) {
			part.partfive();
		}
		else if (a == 2){
			part1.part6v3();
		}
	}
	
	public void part4v2() {
		
		System.out.println("The police are busy fighting a King King sized coffee cup with arms and legs");
		System.out.println("(1) Grab your quidditch broom and prepare for battle       (2) Cower in fear and hope that the police have it under control");
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println(" ");
		part5 part = new part5();
		part6 part2 = new part6();
		
		if (a == 1) {
			part.part5v3();
		}
		
		else if (a == 2) {
			part2.part6v3();
		}
	}
}
