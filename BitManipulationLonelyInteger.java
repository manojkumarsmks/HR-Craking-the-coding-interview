// https://www.hackerrank.com/challenges/ctci-lonely-integer/problem

import java.util.Scanner;

public class BitManipulationLonelyInteger {

	// Xor of number with inself is zero, so the resulting number is unique
	public static int lonelyInteger(int[] a) {
		int uniqueNumber = 0;
		
		for (int i = 0; i < a.length; i++) {
			uniqueNumber ^= a[i];	
		}
		return uniqueNumber;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }

}
