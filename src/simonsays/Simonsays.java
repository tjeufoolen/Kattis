package simonsays;

import java.util.Scanner;

public class Simonsays {
    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int times = sc.nextInt();
	
	sc.nextLine();
	
	for (int i=0; i<times; i++) {
	    String line = sc.nextLine();
	    
	    if (line.contains("Simon says")) {
		String[] lines = line.split("Simon says ");
		System.out.println(lines[1]);
	    }
	}
	
	sc.close();
    }
}
