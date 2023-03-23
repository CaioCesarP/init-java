package initialPolymorphism;
public class BonusControl {

	private double total;

	public void register(Employee employee) {
		double bonus = employee.getBonus();
		this.total += bonus;
	}

	public double getTotal() {
		return this.total;
	}

}
