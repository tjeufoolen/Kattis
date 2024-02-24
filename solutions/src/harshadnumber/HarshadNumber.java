package harshadnumber;

import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	int n = Integer.parseInt(in.nextLine());
	while (!isHarshad(n))
	    n++;
	System.out.println(n);
	
	in.close();
    }

    public static boolean isHarshad(int n) {
	return n % sumDigits(n) == 0;
    }

    public static int sumDigits(int n) {
	String num = Integer.toString(n);
	int sum = 0;
	for (int i = 0; i < num.length(); i++)
	    sum += Integer.parseInt(num.substring(i, i + 1));
	return sum;
    }
}
