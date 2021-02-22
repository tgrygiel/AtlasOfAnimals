package stack;

import java.util.ArrayList;

public class Stack implements IStack{
	private ArrayList<String> stack;
	
	Stack() {
		this.stack = new ArrayList<String>();
	}

	@Override
	public void push(String value) {
		this.stack.add(value);
	}

	@Override
	public String pop() {
		return this.stack.remove(size() - 1);
	}

	@Override
	public String peek() {
		return this.stack.get(size() - 1);
	}

	@Override
	public int size() {
		return this.stack.size();
	}

	@Override
	public boolean isEmpty() {
//		if(size() == 0) {
//			return true;
//		}
//		else {
//			return false;
//		}
		return size() == 0;
	}
}
