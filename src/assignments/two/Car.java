package assignments.two;

import java.util.Date;

public class Car extends FourWheeler {

	Date launchDate;

	public Date getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(Date launchDate) {
		this.launchDate = launchDate;
	}

	public void printLaunchDate() {

		System.out.println("Launch date: " + this.launchDate);

	}

	public static void main(String args[]) {

		Car car = new Car();

		car.setColour("Red");
		car.setNumberOfSeats(4);
		car.setMileage(60);
		car.setModelNumber("F11");
		car.setLaunchDate(new Date());
		
		car.printDetails();
		car.printNoOfSeats();
		car.printLaunchDate();
		car.start();
		car.stop();

	}

}
