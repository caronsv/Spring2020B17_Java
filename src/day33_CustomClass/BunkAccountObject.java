package day33_CustomClass;

public class BunkAccountObject {
    public static void main(String[] args) {
        BankAccount Anna=new BankAccount();
        Anna.accountHolder="Anna";
        Anna.accountNumber=123456;

        Anna.checkingBalance();
        Anna.deposit(33);
        Anna.checkingBalance();

        Anna.withDrow(13);
        Anna.checkingBalance();
        Anna.withDrow(30);
        Anna.checkingBalance();
        Anna.withDrow(1000);
        Anna.checkingBalance();
        System.out.println("=============================");
        System.out.println(Anna);

    }
}
