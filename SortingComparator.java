//https://www.hackerrank.com/challenges/ctci-comparator-sorting/problem
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortingComparator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Player[] player = new Player[n];
		
		for(int i=0; i<n; i++) {
			player[i] = new Player(sc.next(), sc.nextInt());
		}
		sc.close();
		
		Arrays.sort(player, new Comparator<Player>() {

			@Override
			public int compare(Player arg0, Player arg1) {
				
				// Just this logic
				return arg0.score > arg1.score ? -1 : (arg0.score < arg1.score) ? 1:0;
			}

		});
		for(int i=0; i<player.length; i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}
		
		
	}
}

class Player {
	String name;
	int score;
	
	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}
