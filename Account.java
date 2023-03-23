public class Account {
  private static int NumberOfAccounts;
  private double balance;
  private int agency;
  private int accountNumber;
  private Holder holder;

  public static int getNumberOfAccounts() {
    return Account.NumberOfAccounts;
  }

  public Account(int Agency, int AccountNumber) {
    Account.NumberOfAccounts++;
    this.agency = Agency;
    this.accountNumber = AccountNumber;
    System.out.println("Conta criada com a conta de número " + AccountNumber);
  }

  /**
   * @param Amount
   * @return boolean
   */
  public boolean verifyIfAmountIsNullOrNegative(double Amount) {
    if (Amount <= 0) {
      System.err.println("Amount cannot be null or negative.");
      return false;
    }
    return true;
  }

  /**
   * @param balance,Amount
   * @return boolean
   */
  public boolean verifyIfAccountBalanceMinusAmountIsGreaterOrEqualToZero(double balance, double Amount) {
    if (balance - Amount < 0) {
      System.err.println("Insufficient funds.");
      return false;
    }
    return true;
  }

  /**
   * @param Amount
   * @return boolean
   */
  public boolean deposit(double Amount) {
    if (!verifyIfAmountIsNullOrNegative(Amount)) {
      return false;
    }

    this.balance += Amount;
    System.out.println("Amount deposited successfully.");
    return true;
  }

  /**
   * @param Amount
   * @return boolean
   */
  public boolean withdraw(double Amount) {
    if (!verifyIfAmountIsNullOrNegative(Amount)) {
      return false;
    }

    if (!verifyIfAccountBalanceMinusAmountIsGreaterOrEqualToZero(this.balance, Amount)) {
      return false;
    }

    this.balance -= Amount;
    System.out.println("Amount withdraw successfully.");
    return true;
  }

  /**
   * @param Amount,Account
   * @return boolean
   */
  public boolean transfer(double Amount, Account Account) {
    if (!verifyIfAmountIsNullOrNegative(Amount)) {
      return false;
    }

    if (!verifyIfAccountBalanceMinusAmountIsGreaterOrEqualToZero(this.balance, Amount)) {
      return false;
    }

    this.withdraw(Amount);
    Account.deposit(Amount);
    System.out.println("Amount transfer successfully.");
    return true;
  }

  /**
   * @return double
   */
  public double getBalance() {
    return this.balance;
  }

  /**
   * @return double
   */
  public double getAgency() {
    return this.agency;
  }

  /**
   * @return double
   */
  public double getAccontNumer() {
    return this.accountNumber;
  }

  /**
   * @param Holder
   * @return void
   */
  public void setHolder(Holder Holder) {
    this.holder = Holder;
  }

  /**
   * @return Holder
   */
  public Holder getHolder() {
    return this.holder;
  }

}
