package r2;

import java.util.Scanner;

public class r2 {
	
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i1 = sc.nextInt();
		int result = sc.nextInt();
		int i2 = (result * 2) - i1;
		
		System.out.println(i2);
	}
	
}
