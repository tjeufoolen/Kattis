package bijele;

import java.util.Scanner;

public class Bijele {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int[] pieces = new int[] {
				sc.nextInt(), // 1
				sc.nextInt(), // 1
				sc.nextInt(), // 2
				sc.nextInt(), // 2
				sc.nextInt(), // 2
				sc.nextInt()  // 8
				};
		
		String piecesToComplete = "";
		for(int i=0; i<pieces.length; i++) {
			int amountNeeded = 0;
			
			if (i < 2) {
				amountNeeded = 1;
			} else if (i >= 2 && i < 5) {
				amountNeeded = 2;
			} else {
				amountNeeded = 8;
			}
			
			int result = (amountNeeded - pieces[i]);
			piecesToComplete += result + " ";
		}
		
		System.out.println(piecesToComplete);
	}
}