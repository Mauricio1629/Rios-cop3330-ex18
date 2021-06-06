/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Mauricio Rios
 */
package ex18;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String temp = myApp.getTemp();
        int num1 = myApp.getNum(temp);
        String outputString = myApp.tempConvert(num1, temp);
        myApp.printOutput(outputString);
    }

    public String getTemp() {
        String temp;
        boolean isNumber;
        do {
            System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit. ");
            temp = in.next();
            if (temp.equalsIgnoreCase("c")) {
                isNumber = true;
            } else if (temp.equalsIgnoreCase("f")) {
                isNumber = true;
            } else {
                System.out.println("ERROR: Please only enter C or F - Try again");
                isNumber = false;
            }
        } while(!(isNumber));
        return temp;
    }

    public int getNum(String temp) {
        if(temp.equalsIgnoreCase("C")) {
            System.out.printf("Your choice: %s\nPlease enter the temperature in Fahrenheit: ", temp);
        }
        else {
            System.out.printf("Your choice: %s\nPlease enter the temperature in Celsius: ", temp);
        }
        return in.nextInt();
    }

    public String tempConvert(int num1, String temp) {
        if(temp.equalsIgnoreCase("c")) {
            int temp2 = (num1 -32) * 5/9;
            return "The temperature in Celsius is "+temp2+".";
        }
        else {
            int temp2 = (num1 * 9/5) +32;
            return "The temperature in Fahrenheit is "+temp2+".";
        }
    }

    public void printOutput(String outputString) {
        System.out.print(outputString);
    }
}




