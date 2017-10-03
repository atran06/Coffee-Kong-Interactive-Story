import java.util.Scanner;

public class part1 {
	
	public void partone() {
		
		System.out.println("You started the game");
		System.out.println("You wake up and you notice that your coffee is gone");
		System.out.println("(1) You go try to find it       (2) You go buy a new one");
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println(" ");
		part2 part = new part2();
		
		if (a == 1) {
			part.parttwo();
		}
		
		else if (a == 2) {
			
			part.part2v2();
		}
	}
	
	public void part1v2() {
		
		System.out.println("You ended the game");
	}
}
