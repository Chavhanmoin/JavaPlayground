package LoopsConditionals;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position to find the Fibonacci number:");
        int position = scanner.nextInt();
        if (position<0){
            System.out.println("Please Enter a positive number.");
        }
        else {
            int a = 0;
            int b = 1;
            System.out.println("Fibonacci series upto "+ position+" is: ");
            for (int i=0;i<position;i++){
                System.out.print(a + " " );
                int next = a + b;
                a =b;
                b =next;

            }
        }
        scanner.close();

    }
}
