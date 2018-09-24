package faktor;

import java.util.Scanner;

public class Faktor {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int i2 = sc.nextInt();
		int impactFactor = sc.nextInt();
		int i1 = i2 * impactFactor;
		
		System.out.println(i1);
		
	}
}
