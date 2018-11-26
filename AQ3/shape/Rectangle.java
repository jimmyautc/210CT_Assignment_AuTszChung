//class for Ractangle
public class Rectangle extends Shape {
	private Point topleft;
	private double width;
	private double height;

	public Rectangle(double x, double y, double height, double width) {
		super("rectangle");
		this.width = width;
		this.height = height;
		topleft = new Point(x, y);
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public Point getTopLeft() {
		return topleft;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public String toString() {
		return "TopLeft = " + topleft + " Height = " + height + " Width = " + width;
	}
}