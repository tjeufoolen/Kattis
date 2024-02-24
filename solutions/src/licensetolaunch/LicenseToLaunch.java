package licensetolaunch;

import java.util.Scanner;

public class LicenseToLaunch {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	@SuppressWarnings("unused")
	int licenseDays = scanner.nextInt();
	scanner.nextLine();
	String strJunks = scanner.nextLine();
	String[] strJunksPerDay = strJunks.split(" ");
	// Convert String[] to int[]
	int[] junksPerDay = new int[strJunksPerDay.length];
	for (int i=0; i<strJunksPerDay.length; i++) {
	    junksPerDay[i] = Integer.parseInt(strJunksPerDay[i]);
	}
	
	int smallestAmount = 9999;
	int indexSmallestAmount = -1;
	for (int i=0; i<junksPerDay.length; i++) {
	    if (junksPerDay[i] < smallestAmount) {
		smallestAmount = junksPerDay[i];
		indexSmallestAmount = i;
	    }
	}

	System.out.println(indexSmallestAmount);
	
	scanner.close();
    }
}
