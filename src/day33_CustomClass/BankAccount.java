package day33_CustomClass;

public class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;


    public void checkingBalance(){
        System.out.println("Avaible Balance: "+balance);
    }

    public void withDrow(double amount){
        System.out.println("Withdrowing $"+amount);
        balance-=amount;
    }
    public void deposit(double amount){
        System.out.println("Depositing $"+amount);
        balance+=amount;
    }
    public String toString(){

        String result="Account Holder: "+accountHolder+"\nAccount Number: "+accountNumber+"\nAvaible Balance: "+balance;
   return result;

    }


}
/*
create a custom class for BankAccount
	attributes/data that can have are:
					1. AccountHolder, 2. AccountNumber, 3. Balance
		Actions: showBalance, deposit, withdraw
		requiremnts:
			1. user should be able to deposit money into their account
			2. user should be able to withdraw money from their account
					2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
					2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
			3. user should be able to see their balance
 */