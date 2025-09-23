package LoopsConditionals;

import java.util.Scanner;

public class sumofall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 0 to exit.");
        int sum =0;
        int number;
       do{
           System.out.print("Enter numbers: ");
           number =scanner.nextInt();

           sum+=number;
       }while (number!=0);
        System.out.println("Sum of all input number is "+sum);
        scanner.close();
    }
}
