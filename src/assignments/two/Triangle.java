package assignments.two;

public class Triangle extends Figure {

	int side1;

	int side2;

	int side3;

	public int getSide1() {
		return side1;
	}

	public void setSide1(int side1) {
		this.side1 = side1;
	}

	public int getSide2() {
		return side2;
	}

	public void setSide2(int side2) {
		this.side2 = side2;
	}

	public int getSide3() {
		return side3;
	}

	public void setSide3(int side3) {
		this.side3 = side3;
	}

	public static void main(String[] args) {

		Triangle triangle = new Triangle();

		triangle.setSide1(5);
		triangle.setSide2(5);
		triangle.setSide3(5);

		if ((triangle.getSide1() + triangle.getSide2()) > triangle.getSide3()
				&& (triangle.getSide2() + triangle.getSide3()) > triangle.getSide1()
				&& (triangle.getSide3() + triangle.getSide1()) > triangle.getSide2()) {

			triangle.setPerimeter((float) triangle.getSide1() + triangle.getSide2() + triangle.getSide3());

			float s = (float) triangle.getPerimeter() / 2;

			triangle.setArea((float) Math
					.sqrt(s * (s - triangle.getSide1()) * (s - triangle.getSide2()) * (s - triangle.getSide3())));
			
			triangle.printDetails((float) triangle.getArea(), (float) triangle.getPerimeter());

		} else {
			
			System.out.println("Triangle not possible.");
			
		}

	}

}
