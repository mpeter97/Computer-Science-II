package exam2PracticePackage;

public class Point<T> {
	private T xCoordinate;
	private T yCoordinate;
	
	public Point(T x, T y) {
		xCoordinate = x;
		yCoordinate = y;
	}
	
	public void setX(T x) {
		xCoordinate = x;
	}
	
	public void setY(T y) {
		yCoordinate = y;
	}
	
	public T getX() {
		return xCoordinate;
	}
	
	public T getY() {
		return yCoordinate;
	}
}
