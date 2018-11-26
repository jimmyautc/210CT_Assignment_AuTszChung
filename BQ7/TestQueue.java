/*
	course:210ct
	Name:AuTszChung
	Program:TestQueue.java
	Description: Test Program of ListQueue 
*/


public class TestQueue {

    public static void main(String[] args) {
		//new a list queue object
		ListQueue queue = new ListQueue();
		//enqueue
		queue.enqueue("Alex");
		queue.enqueue("Sandy");
		queue.enqueue("Betty");
		System.out.println(queue);
		//dequeue
		System.out.println("Removed: " + queue.dequeue());
		System.out.println(queue);
		System.out.println("Removed: " + queue.dequeue());
		System.out.println(queue);
		System.out.println("Removed: " + queue.dequeue());
		System.out.println(queue);
    }

} // clas TestQueue