import java.util.Scanner;

public class part5 {

	public void partfive() {
		
		System.out.println("The coffee which has now grown arms and legs and has grown to the size of King kong is now climbing up the building");
		System.out.println("(1) You say 'Fuck it' and you fly to Starbucks to buy a new coffee       (2) Fly after the massive coffee and strike it down, saving the world");
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println(" ");
		part6 part = new part6();
		
		if (a == 1) {
			part.partsix();
		}
		
		else if (a == 2) {
			part.part6v2();
		}
	}
	
	public void part5v3() {
		
		System.out.println("You strike down the coffee and save the world.");
		System.out.println(" ");
		part6 part = new part6();
		part.part6v2();
		
		
	}
}
