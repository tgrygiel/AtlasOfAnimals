package inheritance;

public class Point3d extends Point {
	private int z;

	public Point3d(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public void changePointPosition(int z) {
		this.z = z;
		this.setX(this.getX() - 1);
		this.setY(this.getY() - 1);
	}
	
	public void goToDungeons() {
		int y = this.y;
		y = y * -1;
		this.y = y;
		
		// this.y = this.y * -1;
		// this.y *= -1;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return super.toString() +  ", z=" + z + "]";
	}
	
	
}
