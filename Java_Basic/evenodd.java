package Java_Basic;

import java.util.Scanner;

//Write a program to check whether a number is even or odd (with user input).
public class evenodd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check: ");
        int num = input.nextInt();

        if (num%2==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is odd");
        }


        }
    }
