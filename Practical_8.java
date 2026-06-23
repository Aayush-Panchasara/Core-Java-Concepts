// Practical 8: Apply EMI Calculator in Java - Java program to calculate EMI using Class, Object, Variables, Operators, and Datatypes.

import java.util.Scanner;

/**
 * Class for calculating the EMI
 */
class EMICalculator{
    
    double principalAmount,annualRate,loanTenure;

    public EMICalculator(double principalAmount, double annualRate, double loanTenure){
        this.principalAmount = principalAmount;
        this.annualRate = annualRate;
        this.loanTenure = loanTenure;
    }

    /**
     * Calculate the EMI and print the Total amount, EMI and Total interest in the terminal
     */
    public void calculateEMI(){
        double monthlyIntrestRate = annualRate /(12*100);
        double monthlyLoanTenure = loanTenure * 12;

        double emi = (principalAmount * monthlyIntrestRate * Math.pow(1 + monthlyIntrestRate, monthlyLoanTenure)) / (Math.pow(1 + monthlyIntrestRate, monthlyLoanTenure)-1);

        double totalAmount = emi * monthlyLoanTenure;
        double totalInterest = totalAmount - principalAmount;

        System.out.println("EMI Result\n");
        System.out.println("Total Amount: "+ totalAmount);
        System.out.println("EMI: "+emi);
        System.out.println("Total Interest: "+totalInterest);
    }
}

public class Practical_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal Loan Amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Annual Interest Rate in %: ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter Loan Tenure in Years: ");
        double years = scanner.nextDouble();

        EMICalculator cal = new EMICalculator(principal, annualRate, years);
        cal.calculateEMI();
    }
}
