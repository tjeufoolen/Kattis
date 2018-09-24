package twostones;

import java.util.Scanner;

public class TwoStones {
	public static void main(String[] args) {
		
		String person;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int stone = sc.nextInt(); 
	
		if ((stone % 2) == 0) {
			person = "Bob";
		} else {
			person = "Alice";
		}
		
		System.out.println(person);
		
	}
}