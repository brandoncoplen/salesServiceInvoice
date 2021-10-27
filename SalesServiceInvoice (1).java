/* Name: Brandon Coplen
Email: bcoplen@una.edu
Program Source File Name: SalesServiceInvoice.java
Due Date: 9/16/2021
Course Information: CIS 315-01
Program Assignment: Progect #1
Program Description: invoice for sales

In keeping with the honor code policies of the University of University of North Alabama, the School of Business, and the Department of Computer Science, I affirm that I have neither given nor received on this programming assignment. This assignmentrepresents my individual, original effort. ... My Signature is on File.


*/

import java.util.Scanner; // import scanner
public class SalesServiceInvoice {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      
      //variables
      String name;
      String address;
      String payment;
      double cost;
      double serviceFee;
      double taxAmount;
      double taxRate;
      double bill;
      double total;
      
      //input
      System.out.print("Enter your name ");
      name = input.nextLine();
      
      System.out.print("Enter your address ");
      address = input.nextLine();
      
      System.out.print("Enter your mode of Payment(credit/debit) ");
      payment = input.nextLine();
      
      System.out.print("Enter your cost of services ");
      cost = input.nextDouble();
      
      
      //calculations
      serviceFee = 1500;
      taxRate = .07;
      bill = serviceFee + cost;
      taxAmount = bill * .07;
      total = bill + taxAmount;
      
      
      //print
      System.out.println("Customer Name: " + name);
      System.out.println("Customer Address: " + address);
      System.out.println("Mode of payment: " + payment);
      
      System.out.println("Cost of sales service: $" + cost);
      System.out.println("Service Fee: $" + serviceFee);
      System.out.println("Tax amount: $" + taxAmount);
      System.out.println("Total Monthly Payment: $" + total);
      
      
    }
}