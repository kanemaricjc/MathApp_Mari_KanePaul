/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mathapp;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class MathApp {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int option;
        String choice = "Y";
        while (choice.equalsIgnoreCase("Y")) {
        System.out.println();
        System.out.println("=== Math Apps ===");
        System.out.println("1. Addition of two integers. ");
        System.out.println("2. Subtraction of two integers");
        System.out.println("3. Number raised to a specific number");
        System.out.println("4. N-kilometers to specific units of measurement");
        System.out.println("5. Factorial of a number");
        System.out.println("6. Celcius to Fahrenheit");
        System.out.println("7. Fahrenheit to Celsius");
        System.out.println("8. Multiplication Table Generator");
        System.out.println("Please choose an option (1-8). ");
        option=input.nextInt();
                
        switch (option) {
            
            case 1:
                
                System.out.println("You have chosen: Addition of two integers ");
                System.out.println("Please input integer number 1.");
                int integer1sa1 = input.nextInt();
                System.out.println("Please input integer number 2.");
                int integer2sa1 = input.nextInt();
                int integersa1 = integer1sa1 + integer2sa1;
                System.out.println(integer1sa1 + " added to " + integer2sa1 + " is: " + integersa1 + ".");
                
                break;
            
            case 2:
                
                System.out.println("You have chosen: Subtraction of two integers ");
                System.out.println("Please input integer number 1.");
                int integer1sa2 = input.nextInt();
                System.out.println("Please input integer number 2.");
                int integer2sa2 = input.nextInt();
                int integersa2 = integer1sa2 + integer2sa2;
                System.out.println(integer1sa2 + " added to " + integer2sa2 + " is: " + integersa2 + ".");
                break;
                
            case 3:
                
                System.out.println("You have chosen: Number raised to a specific number ");
                System.out.println("Please input the number to be raised to a specific number.");
                double numbersa3 = input.nextDouble();
                System.out.println("Please input the power of the number you want to raise.");
                double powersa3 = input.nextDouble();
                double finalnumbersa3 = Math.pow(numbersa3,powersa3);
                System.out.println(numbersa3 + " raised to " + powersa3 + " is: " + finalnumbersa3 + ".");
                
                break;

                
            case 4:
                
                System.out.println("You have selected: N-kilometers to specific units of measurement");
                System.out.println("What is the measure of the unit in kilometers?");
                double kilometersa4 = input.nextDouble();
                System.out.println("1. Miles");
                System.out.println("2. Foot");
                System.out.println("3. Yards");
                System.out.println("Please input an option (1-3).");
                int optionsa4 = input.nextInt();
                
                switch (optionsa4) {
                    
                    case 1:
                        
                        double milessa4 = kilometersa4 / 1.609;
                        System.out.println(kilometersa4+ " kilometers into Miles is approximately: " + milessa4 + " miles.");
                        
                        break;
                    
                    case 2:
                        
                        double footsa4 = kilometersa4*3281;
                        System.out.println(kilometersa4+ " kilometers into Foot is approximately: " + footsa4 + " foot.");
                        
                        break;
                        
                    case 3:
                        
                        double yardsa4 = kilometersa4*1094;
                        System.out.println(kilometersa4+ " kilometers into Yards is approximately: " + yardsa4 + " yards.");
                        
                        break;
                        
                }
                
                  
                break;    
                
            case 5:
                
                System.out.println("You have chosen: Factorial of a number ");
                System.out.println("Please input a number to find its factorial.");
                int numbersa5 = input.nextInt();
                int c = 1;
                int number5factorial = 1;   
                
                if (numbersa5 > 0)  {

                do {
                    number5factorial = number5factorial * c;
                    c++;
                } while ( c <= numbersa5 );
                System.out.println(numbersa5 + " factorial is: " + number5factorial);
                } else {
                    
                    System.out.println("This number is negative. Please input a non-negative number.");
                    
                }
                break;
                
            case 6:
                
                System.out.println("You have chosen: Celsius to Fahrenheit");
                System.out.println("Please input the temperature in Celsius.");
                double celsiussa7 = input.nextDouble();
                double fahrenheitsa7 = (celsiussa7*1.8) + 32 ;
                System.out.println(celsiussa7 + " degree Celsius to Fahrenheit is: " + fahrenheitsa7 + " degree Fahrenheit.");
                
                break;
                
            case 7:
                
                System.out.println("You have chosen: Fahrenheit to Celsius");
                System.out.println("Please input the temperature in Fahrenheit.");
                double fahrenheitsa6 = input.nextDouble();
                double celsiussa6 = ( (fahrenheitsa6 - 32 ) * 5 )/9 ;
                System.out.println(fahrenheitsa6 + " degree Fahrenheit to Celsius is: " + celsiussa6 + " degree Celsius");
                
                break;
                
            case 8:
                
                System.out.println("You have chosen: Multiplication Table Generator");
                System.out.println("Please input a number.");
                int number1value = input.nextInt();
        
                for (int a = 1; a <= 10; a++) {
                    
                    int number1sum = number1value * a;
                    System.out.println(number1value + " x " + a + " = " + number1sum);

                }
                
                break;
                
            default: 
                
                System.out.println("Please input an option from 1-8.");
                
                break;
                }
        
            System.out.println("Would you like to use another program? (Y/N)");
            choice = input.next();
            if ( choice.equals("N") ) {
                System.out.println("Thank you for using this program!");
            } 
            }
        } 
}
    

