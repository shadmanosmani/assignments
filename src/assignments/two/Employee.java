package assignments.two;

public class Employee {

	long id;

	String name;

	int age;

	double basicSalary;

	double hra;

	double travelAllowance;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(double travelAllowance) {
		this.travelAllowance = travelAllowance;
	}

	public void showDetails(long id, String name, int age) {

		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);

	}

	public void calculateSalary(double basicSalary, double hra, double travelAllowance) {

		System.out.println("Salary: " + (basicSalary + hra + travelAllowance));

	}

}
