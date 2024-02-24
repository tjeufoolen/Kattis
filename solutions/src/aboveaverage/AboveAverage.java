package aboveaverage;

import java.util.Scanner;

public class AboveAverage {
    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int c = sc.nextInt();
	
	for (int i=0; i<c; i++) {
	    sc.nextLine();
	    
	    int students = sc.nextInt();
	    int[] grades = new int[students];
	    double average = 0;
	    
	    for (int j=0; j<students; j++) {
		grades[j] = sc.nextInt();
		average += grades[j];
	    }
	    average /= students;
	    
	    int higherThanAvg = 0;
	    for (int grade : grades) {
		if (grade > average) {
		    higherThanAvg++;
		}
	    }
	    
	    System.out.printf("%.3f%s  \n", (double)higherThanAvg/students*100, "%");
	}
	
	sc.close();
    }
}
