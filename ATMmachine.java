package introduction;

import java.util.Scanner;

class ATMinterface {
private String acNumber;
private String name;
private double balance;

public ATMinterface(String acNumber, String name, double balance) {
	this.acNumber=acNumber;
	this.name=name;
	this.balance=balance;
	// TODO Auto-generated constructor stub
}

public void deposit(double amount)
{
	balance+=amount;
	System.out.println("Your Account Number:"+acNumber+" is Credited with Rs."+amount);
}

public void withdraw(double amount)
{
	if(amount>balance)
	{
		System.out.println("Unsufficient Balance in your Account.");
	}
	else
	{
		balance-=amount;
		System.out.println("Your Account Number:"+acNumber+" is Debited with Rs."+amount);
	}
		
	}

public void displayAmount()
{
	System.out.println("Your Current Balance in Your Account is: "+balance);
}

}
public class ATMmachine{
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ATMinterface myAtm=new ATMinterface("123456789","Charan",10000.00);
		int choice ;
		do
		{
		System.out.println("***Welcome to Bank Interface***");
		System.out.println("Enter you option:-");
		System.out.println("1.DEPOSIT ");
		System.out.println("2.WITHDRAW ");
		System.out.println("3.BALANCE ENQUIRY ");
		System.out.println("4.EXIT");
		System.out.println("ENTER YOUR CHOICE: ");
		choice=sc.nextInt();
		
			switch(choice) {
			case 1:
				System.out.println("Enter the deposit amount: ");
				double depAmount=sc.nextDouble();
				myAtm.deposit(depAmount);
				break;
				
			case 2:
				System.out.println("Enter the withdrawal amount: ");
				double withdrawAmount=sc.nextDouble();
				myAtm.withdraw(withdrawAmount);
				break;
				
			case 3:
				myAtm.displayAmount();
				break;
				
			case 4:
				System.out.println("Thank you for using the Bank Interface....Visit Again.");
				break;
				
				default:
					System.out.println("Invalid choice....Please Try again.");
				
				
			}
		}while(choice!=4);
			
	}
}