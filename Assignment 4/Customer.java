import java.util.Scanner;
public class Customer {
private int accountNo;
private String accName;
private double balance;
public Customer(int accountNo, String accName, double balance) {
this.accountNo = accountNo;
this.accName = accName;
this.balance = balance;
}
public synchronized void deposit(double amount) {
System.out.println("Depositing " + amount + "...");
balance += amount;
System.out.println("Deposit complete. New balance: " + balance);
notify();
}
public synchronized void withdraw(double amount) {
while (balance < amount) {
System.out.println("Insufficient balance. Waiting for deposit...");
try {
wait();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
System.out.println("Withdrawing " + amount + "...");
balance -= amount;
System.out.println("Withdrawal complete. New balance: " + balance);
}
public static void main(String[] args) {
Customer customer = new Customer(12345, "John Doe", 100.0);
Scanner scanner = new Scanner(System.in);
System.out.print("Enter withdrawal amount: ");
double withdrawAmount = scanner.nextDouble();
Thread withdrawThread = new Thread(() -> customer.withdraw(withdrawAmount));
withdrawThread.start();
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
System.out.print("Enter deposit amount: ");
double depositAmount = scanner.nextDouble();
Thread depositThread = new Thread(() -> customer.deposit(depositAmount));
depositThread.start();
try {
withdrawThread.join();
depositThread.join();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}