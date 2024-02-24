package trik;

import java.util.Scanner;

public class Trik {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int[] cups = new int[] {1,0,0}; // 0 = no ball, 1 = ball
		
		for(int i=0; i<str.length(); i++) {
			String currentMove = str.substring(i, i+1);
			
			switch(currentMove) {
				case "A":
					if (cups[0] == 1) {
						cups[0] = 0;
						cups[1] = 1;
					} else if (cups[1] == 1) {
						cups[1] = 0;
						cups[0] = 1;
					}
					break;
				case "B":
					if (cups[1] == 1) {
						cups[1] = 0;
						cups[2] = 1;
					} else if (cups[2] == 1) {
						cups[2] = 0;
						cups[1] = 1;
					}
					break;
				case "C":
					if (cups[0] == 1) {
						cups[0] = 0;
						cups[2] = 1;
					} else if (cups[2] == 1) {
						cups[2] = 0;
						cups[0] = 1;
					}
					break;
			}
		}
		
		int ballCupNumber = 0;
		for(int i=0; i<cups.length; i++) {
			if (cups[i] == 1) ballCupNumber = (i+1);
		}
		
		System.out.println(ballCupNumber);
	}
}