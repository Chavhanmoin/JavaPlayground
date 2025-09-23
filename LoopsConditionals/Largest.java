package LoopsConditionals;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 0 to exit.");
        int largest =0;
        int number;
        do{
            System.out.print("Enter numbers: ");
            number =scanner.nextInt();

            if(number>largest){
                largest = number;
            }


        }while (number!=0);
        System.out.println("Largest number is "+largest);
        scanner.close();

    }

}
