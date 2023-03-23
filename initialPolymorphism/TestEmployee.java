package initialPolymorphism;
public class TestEmployee {

	public static void main(String[] args) {
		Employee firstEmployee = new Employee("Caio César", "999.999.999-99");
		firstEmployee.setSalary(4000.0);

		System.out.println(firstEmployee.getName());
		System.out.println(firstEmployee.getBonus());

		System.out.println("Total de funcionários: " + Employee.getTotal());
	}

}
