package queue;

import java.util.ArrayList;

public class Queue implements IQueue {

	private ArrayList<Integer> list;
	
	public Queue() {
		this.list = new ArrayList();
	}
	
	@Override
	public void push(int value) {
		this.list.add(value);
	}

	@Override
	public int pull() {
		return this.list.remove(0);
	}

	@Override
	public int peek() {
		return this.list.get(0);
	}

	@Override
	public int size() {
		return this.list.size();
	}

	@Override
	public boolean isEmpty() {
		return this.list.size() == 0;
	}
	
	public String toString() {
		return this.list.toString();
	}
}
