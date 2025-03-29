import java.util.ArrayList;

class Account {
   private double balance;
   private String accountNumber;
  
   Account(String accountNumber) {
       this.accountNumber = accountNumber;
       this.balance = 0.0;
   }
  
   public void deposit(double amount) {
       balance += amount;
   }
  
   public void withdraw(double amount) {
       if (amount <= balance) {
           balance -= amount;
       } else {
           System.out.println("Insufficient balance.");
       }
   }
  
   public double getBalance() {
       return balance;
   }
  
   public String getAccountNumber() {
       return accountNumber;
   }
}
class Customer {
   private String name;
   private ArrayList<Account> accounts;
  
   public Customer(String name) {
       this.name = name;
       this.accounts = new ArrayList<>();
   }
  
   public void openAccount(Account account) {
       accounts.add(account);
   }
  
   public void viewBalance() {
       System.out.println("Balances for " + name + ":");
       for (Account account : accounts) {
           System.out.println("Account Number: " + account.getAccountNumber() + " | Balance: " + account.getBalance());
       }
   }
}
class Bank {
   private ArrayList<Customer> customers;
  
   public Bank() {
       customers = new ArrayList<>();
   }
  
   public void addCustomer(Customer customer) {
       customers.add(customer);
   }
  
   public void openAccount(Customer customer, Account account) {
       customer.openAccount(account);
   }
}
class Main {
   public static void main(String[] args) {
       Bank bank = new Bank();
      
       Customer john = new Customer("John");
       Customer alice = new Customer("Alice");
      
       bank.addCustomer(john);
       bank.addCustomer(alice);
      
       Account johnChecking = new Account("CHK001");
       Account johnSavings = new Account("SAV001");
       Account aliceSavings = new Account("SAV002");
      
       bank.openAccount(john, johnChecking);
       bank.openAccount(john, johnSavings);
       bank.openAccount(alice, aliceSavings);
      
       johnChecking.deposit(500);
       johnSavings.deposit(1000);
       aliceSavings.deposit(1500);
      
       john.viewBalance();
       alice.viewBalance();
   }
}