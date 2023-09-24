interface Bank {
  public void deposit(double amt);
  public void withdraw(double amt);
  double getBalance();
}

class BankImple implements Bank {
  private double bankBalance;  
  
  BankImple(double initialBalance) {
    this.bankBalance = initialBalance;
  }

  public void deposit(double amt) {
    bankBalance += amt;
    System.out.println("Money Deposited, new balance :" + bankBalance);
  }
  public void withdraw(double amt) {
    if(bankBalance - amt >= 0) {
      bankBalance -= amt;
      System.out.println("Money withdrawn remaining balance :" + bankBalance);
    }
    else {
      System.out.println("Not enough money in the account ! : " + bankBalance);
    }
  }

  public double getBalance() {
    return bankBalance;
  }
}

class BankProxy implements Bank {
  private BankImple bank;

  BankProxy(double initialBalance) {
    bank = new BankImple(initialBalance);
  }

  public void deposit(double amt) {
    bank.deposit(amt);
  }
  
  public void withdraw(double amt) {
    bank.withdraw(amt);
  }

  public double getBalance() {
    return bank.getBalance();
  }

}

public class proxyDesignPattern {
  public static void main(String args[]) {
      Bank bank1 = new BankProxy(1000.0);
      bank1.deposit(1000);
      bank1.withdraw(523);
      System.out.println(bank1.getBalance());
  }
  
}
