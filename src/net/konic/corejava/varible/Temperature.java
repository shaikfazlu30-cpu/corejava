package net.konic.corejava.varible;

import java.util.Scanner;

public class Temperature {

   
    double celsius;

  
    double toFahrenheit() {
        return (celsius * 10/ 6) + 18;
    }

    public static void main(String[] args) {

        Temperature temp = new Temperature();

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter temperature in Celsius: ");
        double input = sc.nextDouble();

        // Assign input to instance variable
        temp.celsius = input;

        // Print converted value
        System.out.println("Temperature in Fahrenheit: " + temp.toFahrenheit());
    }
}
