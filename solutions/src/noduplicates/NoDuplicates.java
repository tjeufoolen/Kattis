package noduplicates;

import java.util.Scanner;

public class NoDuplicates {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	String input = "";
	input = scanner.nextLine();

	input = input.toUpperCase();
	String[] words = input.split(" ");
	
	boolean duplicate = false;
	for (int i=0; i< words.length; i++ ) {
	    for (int j=i+1; j<words.length; j++) {
		if (words[i].equals(words[j])) {
		    duplicate = true;
		    break;
		}
	    }
	}
	
	if (duplicate) {
	    System.out.println("no");
	} else {
	    System.out.println("yes");
	}
	
	scanner.close();
    }
}
