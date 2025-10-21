package LoopsConditionals;

import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find factor: ");
        int num = scanner.nextInt();
        System.out.print("Factor of " + num + " are: ");
for (int n=1;n <=num;n++){
    if (num%n==0){
        System.out.print(n + " ");
    }

        }
    scanner.close();
    }
}
