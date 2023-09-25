package payroll;
import java.util.Scanner;
public class Payroll {

	public static void main(String[] args) {
		Scanner employeeNo = new Scanner(System.in);
		Scanner employeeName = new Scanner(System.in);
		System.out.print("Enter employee's name:");
        String name = employeeName.nextLine();
        Scanner designate = new Scanner(System.in);
        System.out.print("Enter designation:");
        String designation = designate.next();
        Scanner work = new Scanner(System.in);
        System.out.print("Enter the number of days worked:");
        int workDays = work.nextInt();
        Scanner pay = new Scanner(System.in);
        System.out.print("Enter the pay rate:");
        int payRate = pay.nextInt();
        Scanner date = new Scanner(System.in);
        System.out.print("Enter the generation date:");
        String generationDate = date.next();
        int basicPay = workDays*payRate;
        int pf = basicPay/10;
        final int profTax = 200;
        int grossEarn = basicPay;
        int totalDeduct = pf + profTax;
        int netPay = basicPay-totalDeduct;
        System.out.print("ENTER THE EMPLOYEE NO TO GENERATE PAYSLIP: ");
        int num= employeeNo.nextInt();
        System.out.println("\t\t\t\t\t\tSHREE KRISHNA CHEMISTS AND DRUGGIST");
        System.out.println("\t\t\t\t\t\t\t\tSALARY MONTH 9 2013");
        System.out.println("\t\tEMP.NO.: "+num+"       EMP.NAME: "+name+"     DESIGNATION:"+designation);
        System.out.println("\t\tDAYS WORKED: "+workDays+"   PAY RATE: "+payRate+"  	  GEN.DATE:"+date);
        System.out.println("\t\t-----------------------------------------------------------------------------");
        System.out.println("\t\tEARNINGS          AMOUNT(R.S)           DEDUCTIONS         AMOUNT(RS");
        System.out.println("\t\t-----------------------------------------------------------------------------");
        System.out.println("\t\tBASIC PAY         "+basicPay+"                   P.F.                  "+pf);
        System.out.println("                                                         PROF.TAX              "+profTax);
        System.out.println("\t\t------------------------------------------------------------------------------");
        System.out.println("\t\tGROSS EARN.        "+grossEarn+"               TOTAL DEDUCT.           "+totalDeduct);
        System.out.println("                                                         NET PAY                "+netPay);

	}

}
