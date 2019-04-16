package nastyhacks;

import java.util.ArrayList;
import java.util.Scanner;

public class Nastyhacks {
    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int totalCases = scanner.nextInt();
	ArrayList<int[]> cases = new ArrayList<int[]>();

	scanner.nextLine();
	
	// Save to array
	for (int i = 0; i < totalCases; i++) {
	    String[] input = scanner.nextLine().split(" ");

	    int[] data = new int[3];
	    data[0] = Integer.parseInt(input[0]); // Revenue if not advertise
	    data[1] = Integer.parseInt(input[1]); // Revenue if advertise
	    data[2] = Integer.parseInt(input[2]); // Advertisement cost

	    cases.add(i, data);
	}

	// Calculate all data
	for (int i = 0; i < totalCases; i++) {
	    int[] currentCase = cases.get(i);

	    int notAdvertisedRevenue = currentCase[0];
	    int advertisedRevenue = currentCase[1];
	    int advertisementCost = currentCase[2];

	    if (notAdvertisedRevenue == advertisedRevenue - advertisementCost) {
		System.out.println("does not matter");
	    } else if (notAdvertisedRevenue >= advertisedRevenue - advertisementCost) {
		System.out.println("do not advertise");
	    } else {
		System.out.println("advertise");
	    }
	}

	scanner.close();
    }
}
