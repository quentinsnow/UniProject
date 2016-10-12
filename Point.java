
public class Point {
	
	private double x;
	private double y;
	
	//Accesseur 
	public double getX() {return this.x;}
	
	public double getY() {return this.y;}
	
	//Méthodes
	
	public void déplacerPoint(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}
	
	public Point translater(double dx, double dy) {
		return new Point (dx,dy);
	}
	
	//Constructeurs
	
	public Point (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point () {
		this.x = 0;
		this.y = 0;
	}
}
