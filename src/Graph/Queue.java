package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Queue {
	LinkedList<Integer> list;
	public Queue() {
		list = new LinkedList<>();
	}
	public void enqueue(int data) {
		list.add(data);
	}
	public int dequeue() {
		return list.removeFirst();
	}
	public boolean isEmpty() {
		return list.isEmpty() ? true : false;
	}
	public void printQueue() {
		List list1 = list;
		Iterator<Integer> iterator = list1.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(4);
		queue.enqueue(2);
		queue.enqueue(9);
		queue.printQueue();
		queue.enqueue(93);
		queue.dequeue();
		queue.printQueue();
	}
}
