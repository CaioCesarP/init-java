package initialPolymorphism;
public class Manager extends Employee {

	private String password;

	public Manager(String Name, String TaxId) {
		super(Name, TaxId);
	}

	public boolean authenticate(String Password) {
		if (this.password != Password) {
			return false;
		}

		return true;
	}

	public void setPassword(String Password) {
		this.password = Password;
	}

	public double getBonus() {
		return super.getBonus() + super.getSalary();
	}

}
