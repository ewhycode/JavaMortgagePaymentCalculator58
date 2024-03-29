/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mortgagecalculator58;

/**
 *
 * @author EYC
 */

import java.util.Scanner;
 
public class MortgageCalculator58 {
    
    public static void main(String[] args) { //encapsulation
        //to generate user input util.Scanner, Method
        Scanner scanner = new Scanner(System.in); 
 
        //Ask user to enter the total loan amount
        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();
           
        //Ask user for the period of the loan in years
        System.out.print("Enter the loan period in years: ");
        int loanPeriod = scanner.nextInt();
 
        //Display table Title for each column
        System.out.println("INTEREST RATE\tMONTHLY PAYMENT\tTOTAL PAYMENT");
 
        //Interest rate start at 5%, declare variable
        
        //Compute and show payment for interest rates from 5% until 8%, Looping
        double interestRate = 5.00;
        
        while (interestRate <= 8.00) {
            //get monthly interest rate, divide by 100 because 5.00 was declared in previous variable
            double monthlyInterestRate = interestRate / 100 / 12; //get interest rate            
                
            int monthsInAYear = 12;
            int numberOfPayments = loanPeriod * monthsInAYear; //declare var number of payments
 
           
            //break formula into two lines: double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments)); 
            double monthlyPaymentInt = loanAmount * monthlyInterestRate;
            double monthlyPaymentPV = (1 - (1 / Math.pow (1 + monthlyInterestRate,numberOfPayments)));
            double monthlyPayment = monthlyPaymentInt / monthlyPaymentPV;
            
               
            // Calculating total payment
            double totalPayment = monthlyPayment * numberOfPayments; //12 included in monthsInAYear variable
 
            //Display results in table with format
            System.out.printf("%.2f%%", interestRate); //2decimal places percentage
            System.out.print("\t\t$"); //apply currency format
            System.out.printf("%.2f", monthlyPayment); //2decimal places cents
            System.out.print("\t\t$"); //applying currency format
            System.out.printf("%.2f\n", totalPayment); //2decimal places cents, \n to print after next line
            
            interestRate += 0.125; //increment interest rate by 1/8
            
           
        }
 
        scanner.close();
    }
}
