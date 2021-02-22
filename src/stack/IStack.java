package stack;

public interface IStack {
	public void push(String value);
	public String pop();
	public String peek();
	public int size();
	public boolean isEmpty();
}
