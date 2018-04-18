// https://www.hackerrank.com/challenges/ctci-making-anagrams/problem
// fcrxzwscanmligyxyvym
// jxwtrhvujlmrpdoqbisbwhmgpmeoke
import java.util.Scanner;

public class StringMakingAnagrams {

	public static int numberNeeded(String first, String second) {
		
		
		int[] characterArrayFirst = new int[26];
		int commonCounter = 0;
		
		for (int i = 0; i < first.length(); i++) {
			characterArrayFirst[first.charAt(i) - 'a'] = characterArrayFirst[first.charAt(i) - 'a']+1;
		}
		
		for (int i = 0; i < second.length(); i++) {
			characterArrayFirst[second.charAt(i) - 'a'] = characterArrayFirst[second.charAt(i) - 'a']-1;
		}
		
		for (int i = 0; i <characterArrayFirst.length; i++ ) {
			commonCounter += Math.abs(characterArrayFirst[i]);
		}
		
		return commonCounter;
	      
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
	}

}
