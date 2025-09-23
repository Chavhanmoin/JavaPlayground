package Java_Basic;

import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        System.out.println("Welcome to SI Java_Basic.calculator");
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Principle amount: ");
        float amount = num.nextFloat();
        System.out.print("Enter rate of interest in %: ");
        float interest = num.nextFloat();
        System.out.print("Enter duration in year: ");
        float year = num.nextFloat();
        float si =(amount*interest*year)/100;

        System.out.println("Your simple interest for above detail is: "+si);
        num.close();
    }
}
