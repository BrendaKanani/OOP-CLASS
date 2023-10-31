package inheritance;

import java.util.Scanner;
class BankAccount{
    int accNo;
    String accName,accPhone,accEmail;
    double AccBal;
    public BankAccount(int accNo,String accName, String accPhone, String accEmail, double AccBal){
        this.accNo=accNo;
        this.AccBal=AccBal;
        this.accPhone=accPhone;
        this.accEmail=accEmail;
        this.accName=accName;
    }
    public void accountholder(){
        System.out.println("Account Number: "+accNo);
        System.out.println("Account Holder Name: "+accName);
        System.out.println("Account Holder Phone: "+accPhone);
        System.out.println("Account Holder Email: "+accEmail);
        System.out.println("Account Holder Balance: "+AccBal);

    }
    public void deposit(double amount){
        AccBal+=amount;
        System.out.println("Deposited: "+amount);
    }
    public void displaybalance(){
        System.out.println("Account Number: "+accNo+"\tBalance: $"+AccBal);

    }


}
class savingsAccount extends BankAccount{
    public savingsAccount(int accNo,String accName, String accPhone, String accEmail, double AccBal){
        super(accNo,accName,accPhone,accEmail,AccBal);
    }
}
class currentAccount extends BankAccount{
    public currentAccount(int accNo,String accName, String accPhone, String accEmail, double AccBal){
        super(accNo,accName,accPhone,accEmail,AccBal);
    }
}

public class Main{
    public static void main(String[] args) {
     savingsAccount asc=new savingsAccount(1001,"Ann Kamau","0705795711","annkamau@gmail.com",300);
     System.out.println("SAVINGS ACCOUNT DETAILS");
     asc.accountholder();
     asc.displaybalance();
     currentAccount cA=new currentAccount(1001,"Ann Kamau","0705795711","annkamau@gmail.com",300);
     System.out.println("\n");
     System.out.println("CURRENT ACCOUNT DETAILS");
     cA.accountholder();
     cA.displaybalance();
    }
}
