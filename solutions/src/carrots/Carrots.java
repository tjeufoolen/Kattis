package carrots;

import java.util.Scanner;

public class Carrots {
    public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);

	String[] numbers = scanner.nextLine().split(" ");
	int contestants = Integer.parseInt(numbers[0]);
	int solved = Integer.parseInt(numbers[1]);
	
	for (int i=0; i<contestants; i++) {
	    scanner.nextLine();
	}
	
	System.out.println(solved);
	
	scanner.close();
    }
}
