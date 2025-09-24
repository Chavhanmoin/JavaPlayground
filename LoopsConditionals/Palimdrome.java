package LoopsConditionals;

import java.util.Scanner;

public class Palimdrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num =scanner.nextInt();
        int reversed = 0;
        int orignal = num;
        while (num!=0){
            int digit = num % 10;
            reversed =reversed * 10 +digit;
            num /=10;
        }
        if(orignal==reversed)
        {
            System.out.println("Number is palimdrome");
        }
        else
        {
            System.out.println("Number is not palimdrome");
        }
        scanner.close();

    }
}
