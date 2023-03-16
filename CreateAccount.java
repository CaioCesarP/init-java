public class CreateAccount {

  public static void main(String[] args) {

    Account firstAccount = new Account();
    Account secondAccount = new Account();

    firstAccount.deposit(1000);

    System.out.println("First account balance: " + firstAccount.balance);

    firstAccount.withdraw(1001);

    System.out.println("First account balance: " + firstAccount.balance);

    firstAccount.withdraw(100);

    System.out.println("First account balance: " + firstAccount.balance);

    firstAccount.transfer(400, secondAccount);

    System.out.println("First account balance: " + firstAccount.balance);
    System.out.println("Second account balance: " + secondAccount.balance);

  }

}
