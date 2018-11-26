/**
 * Title:        ListQueue.java
 * Description:  A Queue class implemented using array
 * Company:      ICT HKIVE(TY)
 * @author       Patrick Tong
 */

import java.util.*;

public class ListQueue extends LinkedList{

	private LinkedList qll;

	public ListQueue() {
		qll = new LinkedList();
	}

	public int size() {
		return qll.count();
	}

	public boolean isEmpty() {
		return qll.isEmpty();
	}

	public void enqueue(Object item) {
		qll.addToTail(item);
	}

	public Object dequeue() throws EmptyQueueException {
		try {
			Object item = qll.removeFromHead();
			return item;
		}
		catch (EmptyQueueException e) {
			throw new EmptyQueueException();
		}
	}

	public Object front() throws EmptyQueueException {
		try {
			Object item = qll.removeFromHead();
			qll.addToHead(item);
			return item;
		}
		catch (EmptyQueueException e) {
			throw new EmptyQueueException();
		}
	}

	public String toString() {
		return qll.toString();
	}

} // class ArrayQueue
class EmptyQueueException extends RuntimeException {
	public EmptyQueueException () {
		super("Queue is empty");
	}
} // class EmptyQueueException
