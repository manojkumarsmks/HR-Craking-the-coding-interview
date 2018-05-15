//https://www.hackerrank.com/challenges/ctci-linked-list-cycle/problem
public class LinkedListsDetectaCycle {
	// Check if it has a cycle - fasterNode and slowerNode 
	boolean hasCycle(Node head) {
		Node fasterNode = head;
		Node slowerNode = head;
		
		if(slowerNode == null)
			return false;
		while(fasterNode.next != null || fasterNode == null) {
			fasterNode = fasterNode.next.next;
			slowerNode = slowerNode.next;
			
			if(slowerNode.equals(fasterNode))
				return true;
		}
		return false;
	}
	
	// Basic node class
	class Node {
		int value;
		Node next;
	}

}
