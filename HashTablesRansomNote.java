//https://www.hackerrank.com/challenges/ctci-ransom-note/problem
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashTablesRansomNote {
	Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    
    // Push the data into the hashmap and its frequency 
    public HashTablesRansomNote(String magazine, String note) {
    	
    	String[] magazineArray = magazine.split(" ");
    	String[] noteArray = note.split(" ");
    	
    	magazineMap = new HashMap<String, Integer>();
    	noteMap = new HashMap<String, Integer>();
    	
    	for(String string : magazineArray) {
    		
    		if(magazineMap.containsKey(string)) {
    			magazineMap.put(string, magazineMap.get(string)+1);
    		}
    		else {
    			magazineMap.put(string, 1);
    		}
    	}
    	
    	for(String string : noteArray) {
    		
    		if(noteMap.containsKey(string)) {
    			noteMap.put(string, noteMap.get(string)+1);
    		}
    		else {
    			noteMap.put(string, 1);
    		}
    	}
    }
    
    public boolean solve() {
    	Set<String> noteString = noteMap.keySet();
    	
    	// Reconstruct the string array from the hashmap 
    	ArrayList<String> noteStringArray = new ArrayList<String>();
    	
    	for(String s : noteString) {
    		int keyTimes = noteMap.get(s);
    		while(keyTimes != 0) {
    			noteStringArray.add(s);
    			keyTimes--;
    		}
    	}
    	
    	//compare the arraylist strings withe the Magazie hashmap keys.
    	for(String string : noteStringArray) {
    		if(magazineMap.get(string) >= 1) {
    			magazineMap.put(string, magazineMap.get(string)-1);
    		}
    		else {
    			return false;
    		}
    		
    	}
    	
    	for(String s:magazineMap.keySet()) {
    		System.out.println("String "+s+" value "+magazineMap.get(s));
    	}
    	
		return true;    
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        HashTablesRansomNote s = new HashTablesRansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
