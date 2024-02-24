package autori;

import java.util.Scanner;

public class Autori {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String[] result = str.split("-");
		
		String shortVariation = "";
		for(int i=0; i<result.length; i++) {
			shortVariation += result[i].substring(0, 1);
		}
		
		System.out.println(shortVariation);
		
	}
}