package _class;

public class Point {

	public int x;
	public int y;
	public Point() {
		this.x=0;
		this.y=0;
	}
	public Point(int x0,int y0) {
		this.x=x0;
		this.y=y0;
	}
	public void movePoint(int dx,int dy) {
		this.x+=dx;
		this.y+=dy;
	}
}
