public class Circle extends Shape {
	private double radius;
	private Point center;

	public Circle(double x, double y, double radius) {
		super("circle");
		this.radius = radius;
		center = new Point(x, y);
	}

	public double getRadius() {
		return radius;
	}

	public Point getCenter() {
		return center;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}

	public String toString() {
		return "Center = " + center + "Radius = " + radius;
	}
}