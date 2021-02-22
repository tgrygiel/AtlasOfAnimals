package stack;

import java.util.Arrays;

public class ArrayStack implements IStack {
	String[] stack;
	
	public ArrayStack() {
		this.stack = new String[0];
	}
	
	@Override
	public void push(String value) {
		String[] temp = this.stack;
		this.stack = new String[temp.length + 1];
		
		for(int i = 0; i < temp.length; i++) {
			this.stack[i] = temp[i];
		}
		this.stack[this.stack.length - 1] = value;
		
	}

	@Override
	public String pop() {
		if (this.stack.length > 0) {
			String[] temp = this.stack;
			this.stack = new String[temp.length - 1];
			
			for(int i = 0; i < this.stack.length; i++) {
				this.stack[i] = temp[i];
			}
			return temp[temp.length - 1];
		}
		return null;
	}

	@Override
	public String peek() {
		if (this.size() > 0) {
			return this.stack[this.stack.length - 1];			
		}
		return null;
	}

	@Override
	public int size() {
		return this.stack.length;
	}

	@Override
	public boolean isEmpty() {
		return this.stack.length == 0;
	}

	@Override
	public String toString() {
		return "ArrayStack [stack=" + Arrays.toString(stack) + "]";
	}
	
	
	
}
