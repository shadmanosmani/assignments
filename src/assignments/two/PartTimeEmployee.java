package assignments.two;

class PartTimeEmployee extends Employee {

	public static void main(String[] args) {

		Employee employee = new PartTimeEmployee();

		employee.setId(2L);
		employee.setName("Swastik");
		employee.setAge(23);
		employee.setBasicSalary(10_000D);
		employee.setHra(1_000D);
		employee.setTravelAllowance(500D);

		employee.showDetails(employee.getId(), employee.getName(), employee.getAge());
		employee.calculateSalary(employee.getBasicSalary(), employee.getHra(), employee.getTravelAllowance());

	}

}