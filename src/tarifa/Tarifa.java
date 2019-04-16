package tarifa;

import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
        int x = sc.nextInt();
    	int n = sc.nextInt();
	int t = x * (n + 1);
        
        for (int i = 0; i < n; i++) {
            t -= sc.nextInt();
        }
        
        System.out.println(t);
        
        sc.close();
    }
}
