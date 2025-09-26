package com.calculator;

import java.util.Scanner;

public class Calculator 
{
    public static void main( String[] args )
    {
        System.out.println("Welcome to My Calculator App");
        System.out.println("Enter 1 for Calculating Square Root");
        System.out.println("Enter 2 for Caculating factorial");
        System.out.println("Enter 3 for Calculating Natural Logarithm");
        System.out.println("Enter 4 for Calculating Power Function");
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int option ;
            option = sc.nextInt();
            if(option==1)
            {
                System.out.println("Enter the Number");
                double number = sc.nextDouble();
                if(number<0)
                {
                    System.out.println("Enter a non-negative number");
                }
                else
                {
                    System.out.println("Square Root of "+number+" is "+findSquareRoot(number));
                }
            }
            

        }
    }
    public static double findSquareRoot(double number)
    {
        return Math.sqrt(number);
    }
}
