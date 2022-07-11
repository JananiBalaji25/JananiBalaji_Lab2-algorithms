package com.greatlearning.PayMoney;

import java.util.Scanner;
class student
{
	int rollNumber;
	String name;
	static String collegeName;
}
public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of the Transactions Array ie) Number of days you want to track");
	    int size=sc.nextInt();
	    int[] transactions=new int[size];
	    for(int i=0;i<size;i++)
	    {
	    	System.out.println("Enter daily transactions in crores of Day:"+(i+1));
	    	transactions[i]=sc.nextInt();
	    }
	    System.out.println("Enter the target amount in crores which you want to achieve");
	    int targetAmount=sc.nextInt();
	    System.out.println();
	    displayTransactions(transactions);
	    PayMoney pm=new PayMoney();
	    int numberOfDays=pm.numberofDays(transactions,targetAmount);
	   if(numberOfDays==-1)
		   System.out.println("The target"+targetAmount+"is not achieved!!");
	   else
	   {
		   System.out.println("The target"+targetAmount+"Crores is achieved in"+numberOfDays+"number of days");     
	   }
	}


	public static void displayTransactions(int[] transactions) {
		for(int i=0;i<transactions.length;i++)
		{
			System.out.println(transactions[i]+"");
		}
	}