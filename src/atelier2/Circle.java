package atelier2;

public class Circle {

	private double radius = 1.0D;
	private String color = "red";
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle() {
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius,2);
	}
	
}
