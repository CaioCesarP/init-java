package initialPolymorphism;
public class Employee {

	private String name;
	private String taxId;
	private double salary;
	private static int total;

	public Employee(String Name, String TaxId) {
		if (Name.split(" ").length < 2) {
			throw new IllegalArgumentException("Insira o nome completo.");
		}
		this.name = Name;
		this.taxId = TaxId;

		Employee.total++;
		System.out.println("Cadastrado com sucesso.");
	}

	public static int getTotal() {
		return Employee.total;
	}

	public double getBonus() {
		return this.salary * 0.10;
	}

	public String getName() {
		return this.name;
	}

	public String getTaxId() {
		return this.taxId;
	}

	public void setSalary(double Salary) {
		if (Salary < 0) {
			System.out.println("Salário do funcionário não pode ser negativo.");
			return;
		}

		this.salary = Salary;
	}

	public double getSalary() {
		return this.salary;
	}

}
