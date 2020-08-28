package assignments.two;

public class Square extends Figure {

	int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public static void main(String args[]) {

		Square square = new Square();

		square.setSide(5);

		square.setArea((float) Math.pow(square.getSide(), 2D));
		square.setPerimeter((float) 4 * square.getSide());

		square.printDetails((float) square.getArea(), (float) square.getPerimeter());

	}

}
