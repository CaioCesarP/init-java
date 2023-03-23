package initialPolymorphism;
public class TestManager {

	public static void main(String[] args) {
		Manager firstManager = new Manager("Caio César", "999.999.999-99");
		firstManager.setSalary(4000.0);
		firstManager.setPassword("123456");

		Employee firstEmployee = new Employee("Wlisses Bruno", "999.999.999-99");
		firstEmployee.setSalary(4000.0);

		BonusControl generalBonusControl = new BonusControl();
		generalBonusControl.register(firstManager);
		generalBonusControl.register(firstEmployee);

		System.out.println("Total de bonificação: " + generalBonusControl.getTotal());
	}

}
