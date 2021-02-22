package queue;

public interface IQueue {
	
	public void push(int value);
	public int pull();
	public int peek();
	public int size();
	public boolean isEmpty();
}
