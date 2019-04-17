package everywhere;

import java.util.ArrayList;
import java.util.Scanner;

public class Everywhere {
    public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	int tests = scanner.nextInt();
	
	scanner.nextLine();
	
	for (int i=0; i<tests; i++) {
	    int citiesTotal = scanner.nextInt();
	    
	    ArrayList<String> cities = new ArrayList<String>();
	    
	    scanner.nextLine();
	    
	    for (int j=0; j<citiesTotal; j++) {
		String city = scanner.nextLine();
		if (!cities.contains(city)) {
		    cities.add(city);
		}
	    }
	    System.out.println(cities.size());
	}
	
	scanner.close();
    }
}
