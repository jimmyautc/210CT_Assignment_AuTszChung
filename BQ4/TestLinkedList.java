/*
	course:210ct
	Name:AuTszChung
	Program:TestLinkedList.java
	Description:Program to test the linkedlist
*/


public class TestLinkedList {
	public static void main (String args[]) {
		//create a linkedlist object s
		LinkedList s = new LinkedList();
		System.out.println(s);
		System.out.println();
		//add to linked list tail
		s.addToTail (new Integer(42));
		System.out.println(s);
		System.out.println();
		//add to linked list tail
		s.addToTail (new Character('n'));
		System.out.println(s);
		System.out.println();
		s.addToTail (new String("hello"));
		System.out.println(s);
		System.out.println();
		//remove a list node
		while (!s.isEmpty()) {
			System.out.println("removed:" + s.removeFromHead());
			System.out.println(s);
			System.out.println();
		}
		//add to linked list head			
		s.addToHead (new Integer(42));
		System.out.println(s);
		System.out.println();
		//add to linked list head		
		s.addToHead (new Character('n'));
		System.out.println(s);
		System.out.println();
		//add to linked list head
		s.addToHead (new String("hello"));
		System.out.println(s);
		System.out.println();
		//remove from linked list tail
		while (!s.isEmpty()) {
			System.out.println("removed:" + s.removeFromTail());
			System.out.println(s);
			System.out.println();
		}
	}
} // class TestLinkedList