package LoopsConditionals;

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to check Armstrong: ");
        int num = scanner.nextInt();
        int copy = num;
        int sum =0;

        int count =String.valueOf(num).length();
        while (copy!=0){
            int digit = copy%10;
            sum +=Math.pow(digit,count);
            copy/=10;
        }
        if(sum==num){
            System.out.println("Number is Armstrong");
        }
        else {
            System.out.println("Number is not Armstrong");
        }
scanner.close();
    }
}
