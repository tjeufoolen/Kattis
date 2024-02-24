package grassseed;

import java.util.Scanner;

public class Grassseed {
    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	double cost = scanner.nextDouble();
	int lawns = scanner.nextInt();

	double totalSize = 0;
	for (int i = 0; i < lawns; i++) {
	    double width = scanner.nextDouble();
	    double length = scanner.nextDouble();
	    
	    double size = width*length;
	    totalSize += size;
	}
	
	System.out.format("%.7f", (double) totalSize*cost);

	scanner.close();
    }
}
