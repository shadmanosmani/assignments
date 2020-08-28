package assignments.two;

class FullTimeEmployee extends Employee {

	public static void main(String[] args) {

		Employee employee = new FullTimeEmployee();

		employee.setId(1L);
		employee.setName("Sachin");
		employee.setAge(23);
		employee.setBasicSalary(20_000D);
		employee.setHra(5_000D);
		employee.setTravelAllowance(2_000D);

		employee.showDetails(employee.getId(), employee.getName(), employee.getAge());
		employee.calculateSalary(employee.getBasicSalary(), employee.getHra(), employee.getTravelAllowance());

	}

}