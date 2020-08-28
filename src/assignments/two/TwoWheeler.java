package assignments.two;

public class TwoWheeler extends Vehicle {

	String twoWheelerType;

	public String getTwoWheelerType() {
		return twoWheelerType;
	}

	public void setTwoWheelerType(String twoWheelerType) {
		this.twoWheelerType = twoWheelerType;
	}

	@Override
	public void start() {

		System.out.println(this.twoWheelerType + " started");

	}

	@Override
	public void stop() {

		System.out.println(this.twoWheelerType + " stopped");

	}

	public static void main(String args[]) {

		TwoWheeler bike = new TwoWheeler();

		bike.setTwoWheelerType(TwoWheelerType.MotorBike.toString());
		bike.setColour("Red");
		bike.setMileage(60);
		bike.setModelNumber("M11");

		bike.printDetails();
		bike.start();
		bike.stop();

	}

}
