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
        System.out.println("Enter 5 to Exit");
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
            else if(option==2)
            {
                System.out.println("Enter the NUmber");
                int number = sc.nextInt();
                if(number<0)
                {
                    System.out.println("Enter a non-negative number");
                }
                else
                {
                    System.out.println("Factorial of "+number+" is "+findFactorial(number));
                }
            }
            else if(option==3)
            {
                System.out.println("Enter the Number");
                double number = sc.nextDouble();
                if(number<=0)
                {
                    System.out.println("Enter a positive number");
                }
                else
                {
                    System.out.println("Natural Logarithm of "+number+" is "+findNaturalLog(number));
                }
            }
            else if(option==4)
            {
                System.out.println("Enter the Base");
                double base = sc.nextDouble();
                System.out.println("Enter the Exponent");
                double exponent = sc.nextDouble();
                System.out.println(base+" raised to the power "+exponent+" is "+calculatePower(base, exponent));
            }
            else if(option==5)
            {
                System.out.println("Exiting...Thank You!");
                break;
            }
            else
            {
                System.out.println("Invalid Option, Enter Correct Option");
            }
            // Checking Before VIVA-4
        }
    }
    public static double findSquareRoot(double number)
    {
        return Math.sqrt(number);
    }
    public static double findFactorial(int number)
    {
        int ans = 1;
        for(int i=1;i<=number;i++)
        {
            ans = ans*i;
        }
        return ans;
    }
    public static double findNaturalLog(double number)
    {
        return Math.log(number);
    }
    public static double calculatePower(double base, double exponent)
    {
        
        return Math.pow(base, exponent);
    }
}
