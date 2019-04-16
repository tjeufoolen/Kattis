package faktor;

import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {

	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);

	int articles = sc.nextInt();
	int impactFactor = sc.nextInt();

	System.out.println(articles * (impactFactor - 1) + 1);

    }
}
