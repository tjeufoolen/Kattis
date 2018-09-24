package timeloop;

import java.util.Scanner;

public class Timeloop {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		
		for(int i=0; i<times; i++) {
			System.out.println((i+1) + " Abracadabra");
		}
		
	}
}
