package inheritance;

public class Point {
	private int x;
	protected int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if(x < 0) {
			this.x = 0;
		} else {
			this.x = x;			
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if(y < 0) {
			this.y = 0;
		} else {
			this.y = y;			
		}
	}

	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}	
	
	
}
