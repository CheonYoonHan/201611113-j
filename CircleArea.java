public class CircleArea {
	private double radius;
	public CircleArea(double r){
		this.radius=r;
	}
	public double getRadius() {
		return radius;
	}
	public double calcArea() {
		return Math.PI*Math.pow(radius,2);
	}
	public void setRadius(double r) {
		radius=r;
	}
	public static void main(String[] args){
		CircleArea c=new CircleArea(10);
		c.setRadius(5);
		System.out.printf("%.1f", c.calcArea());
	}
}