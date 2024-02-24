package aaah;

import java.util.Scanner;

public class AAAH {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		String l1 = sc.next();
		String l2 = sc.next();
		
		if (l1.length() < l2.length()) {
			System.out.println("no");
		} else {
			System.out.println("go");
		}
		
	}
}
