package assignments.two;

public class Figure {

	float area;

	float perimeter;

	public void printDetails(float area, float perimeter) {

		System.out.printf("Area: %.2f%n", area);
		System.out.printf("Perimeter: %.2f\n", perimeter);

	}

	public double getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(float perimeter) {
		this.perimeter = perimeter;
	}

}
