package assignments.two;

public class Circle extends Figure {

	int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public static void main(String args[]) {

		Circle circle = new Circle();

		circle.setRadius(5);

		circle.setArea(3.14f * circle.getRadius() * circle.getRadius());
		circle.setPerimeter(2 * 3.14f * circle.getRadius());

		circle.printDetails((float) circle.getArea(), (float) circle.getPerimeter());

	}

}
