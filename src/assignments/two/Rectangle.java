package assignments.two;

public class Rectangle extends Figure {

	int length;

	int breadth;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public static void main(String args[]) {

		Rectangle rectangle = new Rectangle();

		rectangle.setLength(5);
		rectangle.setBreadth(4);

		rectangle.setArea((float) rectangle.getLength() * rectangle.getBreadth());
		rectangle.setPerimeter((float) 2 * (rectangle.getLength() + rectangle.getBreadth()));

		rectangle.printDetails((float) rectangle.getArea(), (float) rectangle.getPerimeter());

	}

}
