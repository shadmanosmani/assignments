package assignments.two;

public class FourWheeler extends Vehicle {

	int numberOfSeats;

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public void printNoOfSeats() {

		System.out.println("No. of seats: " + this.numberOfSeats);

	}

	@Override
	public void start() {

		System.out.println("Four wheeler started");

	}

	@Override
	public void stop() {

		System.out.println("Four wheeler stopped");

	}

	public static void main(String args[]) {

		FourWheeler car = new FourWheeler();

		car.setColour("Red");
		car.setNumberOfSeats(4);
		car.setMileage(60);
		car.setModelNumber("F11");

		car.printDetails();
		car.printNoOfSeats();
		car.start();
		car.stop();

	}

}
