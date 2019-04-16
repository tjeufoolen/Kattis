package filip;

import java.util.Scanner;

public class Filip {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	String input = "";
	input = scanner.nextLine();

	String[] strNumbers = input.split(" ");
	String[] reversedNumbers = new String[strNumbers.length];
	for (int i=0; i<strNumbers.length; i++) {
	    reversedNumbers[i] = new StringBuilder(String.valueOf(strNumbers[i])).reverse().toString();
	}
	
	int[] numbers = new int[reversedNumbers.length];
	for (int i = 0; i < reversedNumbers.length; i++) {
	    numbers[i] = Integer.parseInt(reversedNumbers[i]);
	}

	int number = 0;
	if (numbers[0] > numbers[1]) {
	    number = numbers[0];
	} else {
	    number = numbers[1];
	}
	
	System.out.println(number);

	scanner.close();
    }
}
