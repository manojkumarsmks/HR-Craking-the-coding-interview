// https://www.hackerrank.com/challenges/ctci-big-o/problem
import java.util.Scanner;

public class TimeComplexityPrimality {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		for (int a0 = 0; a0 < p; a0++) {
			int n = in.nextInt();
			boolean flag = false;
			if (n == 1)
                 System.out.println("Not prime");
			else {
				for (int i = 2; i <= Math.sqrt(n); i++) {
					if (n % i == 0 || n == 2) {
						flag = true;
						break;
					}
				}
				if (flag)
					System.out.println("Not prime");
				else
					System.out.println("Prime");
			}
        }
	}
}
