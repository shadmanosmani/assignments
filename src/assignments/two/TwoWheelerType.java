package assignments.two;

public enum TwoWheelerType {

	Bicycle("Bicycle"), MotorBike("Motor bike");

	private final String twoWheelerType;

	private TwoWheelerType(String twoWheelerType) {

		this.twoWheelerType = twoWheelerType;

	}

	@Override
	public String toString() {

		return twoWheelerType;

	}

}
