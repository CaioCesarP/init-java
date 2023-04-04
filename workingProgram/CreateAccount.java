package workingProgram;
public class CreateAccount {

  public static void main(String[] args) {

    CheckingAccount firstCheckingAccount = new CheckingAccount(0001, 123456);
    firstCheckingAccount.deposit(100.0);

    SavingAccount firstSavingAccount = new SavingAccount(0001, 223456);
    firstSavingAccount.deposit(100.0);

    firstCheckingAccount.transfer(50, firstSavingAccount);

    System.out.println(Account.getNumberOfAccounts());

  }

}
