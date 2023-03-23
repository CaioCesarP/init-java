package pooProgram;
public class CreateAccount {

  public static void main(String[] args) {

    Account firstAccount = new Account(0001, 2766410);
    firstAccount.setHolder(new Holder());

    Holder fistHolder = firstAccount.getHolder();

    fistHolder.setName("Caio César");
    fistHolder.setProfession("Developer");

    System.out.println(fistHolder.getName() + " - " + fistHolder.getProfession());

    Account secondAccount = new Account(0001, 2766412);

    firstAccount.deposit(1000);

    System.out.println("First account balance: " + firstAccount.getBalance());

    firstAccount.withdraw(1001);

    System.out.println("First account balance: " + firstAccount.getBalance());

    firstAccount.withdraw(100);

    System.out.println("First account balance: " + firstAccount.getBalance());

    firstAccount.transfer(400, secondAccount);

    System.out.println("First account balance: " + firstAccount.getBalance());
    System.out.println("Second account balance: " + secondAccount.getBalance());

    System.out.println(Account.getNumberOfAccounts());

  }

}
