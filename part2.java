import java.util.Scanner;

public class part2 {

	public void parttwo() {
		
		System.out.println("You see movement from the corner of your crusty morning eyes");
		System.out.println("(1) You go investigate       (2) Ignore the movement and keep looking for your coffee");
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println(" ");
		part3 part = new part3();
		
		if (a == 1) {
			part.partthree();
		}
		
		else if (a == 2) {
			part.part3v2();
		}
		
	}
	
	public void part2v2() {
		
		System.out.println("You're satisfied with your coffee but you'll always wonder where your coffee went");
	}
}
