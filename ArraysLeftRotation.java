// https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
import java.util.Scanner;

public class ArraysLeftRotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int rotation = sc.nextInt();
		int[] input = new int[length];
		
		for (int i = 0; i < length; i++) {
			input[i] = sc.nextInt();
		}
		
		rotateArray(input, rotation);
	}

	// Rotate 
	private static void rotateArray(int[] input, int rotation) {
		
		for(int i=0; i<rotation; i++) {
			int temp = input[0];
			for(int j=0; j<input.length-1; j++) {
				input[j] = input[j+1];
			}
			input[input.length-1] = temp;
		}
		
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
}
