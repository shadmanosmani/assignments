package assignments.two;

public class Vehicle {

	String colour;

	int mileage;

	String modelNumber;

	public String getColour() {
		return colour;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public void start() {

		System.out.println("Vehicle started");

	}

	public void stop() {

		System.out.println("Vehicle stopped");

	}

	public void printDetails() {

		System.out.println("Colour: " + colour);
		System.out.println("Mileage: " + mileage);
		System.out.println("modelNumbe: " + modelNumber);

	}

}
