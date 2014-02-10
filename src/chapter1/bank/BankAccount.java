package chapter1.bank;

public class BankAccount {
	private  double balance;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	
	//make deposit
	public void deposit(double amount){
		this.balance+=amount;
	}
	
	//make withdraw 
	public void withdraw(double amount){
		this.balance-=amount;
	}
	
	//display balance
	public void display(){
		System.out.println("balance="+this.balance);
	}
}
