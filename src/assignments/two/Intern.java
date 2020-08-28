package assignments.two;

class Intern extends Employee {

	public static void main(String[] args) {

		Employee employee = new Intern();

		employee.setId(3L);
		employee.setName("Kaushik");
		employee.setAge(23);
		employee.setBasicSalary(5_000D);
		employee.setHra(0.0D);
		employee.setTravelAllowance(0.0D);

		employee.showDetails(employee.getId(), employee.getName(), employee.getAge());
		employee.calculateSalary(employee.getBasicSalary(), employee.getHra(), employee.getTravelAllowance());

	}

}