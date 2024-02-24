package hissingmicrophone;

import java.util.Scanner;

public class HissingMicrophone {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		if (str.contains("ss")) {
			System.out.println("hiss");
		} else {
			System.out.println("no hiss");
		}
		
	}
}
