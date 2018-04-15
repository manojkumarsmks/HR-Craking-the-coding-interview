// https://www.hackerrank.com/challenges/ctci-bubble-sort/problem
import java.util.Scanner;

public class SortingBubbleSort {
	
	// Bubble sorting
	public static void BubbleSortAlgo(int[] inputArray) {
		int swapCount = 0;
		for(int i =0; i<inputArray.length-1; i++) {
			for(int j = i+1; j<inputArray.length;j++) {
				// swap the elements if ith element is greater than jth element
				if(inputArray[i] > inputArray[j]) {
					int temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
					swapCount++;
				}
			}
		}
		
		// Output
		System.out.println("Array is sorted in " + swapCount + " swaps");
		System.out.println("First Element: "+inputArray[0]);
		System.out.println("Last Element: "+inputArray[inputArray.length-1]);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        BubbleSortAlgo(a);
	}

}
