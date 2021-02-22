package queue;

public class ArrayQueue implements IQueue {
	private int[] array;
	
	public ArrayQueue() {
		this.array = new int[0];
	}

	@Override
	public void push(int value) {
		int[] temp = this.array;
		this.array = new int[temp.length + 1];
		
		for(int i = 0; i < temp.length; i++) {
			this.array[i] = temp[i];
		}
		this.array[this.array.length - 1] = value;
	}

	@Override
	public int pull() {
		if(this.array.length != 0) {
			int[] temp = this.array;
			this.array = new int[temp.length - 1];
			
			for(int i = 0; i < this.array.length; i++) {
				this.array[i] = temp[i + 1];
			}
			return temp[0];			
		}
		return -1;
	}

	@Override
	public int peek() {
		if (this.array.length != 0) {
			return this.array[0];			
		}
		return -1;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
