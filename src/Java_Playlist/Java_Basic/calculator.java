package Java_Basic;

import java.util.Scanner;

//Basic Calculator using if (+, -, *, /)
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter operation to perform(+,-,*,/,%): ");
        char ope =scanner.next().charAt(0);
        System.out.print("Enter number A: ");
        int a= scanner.nextInt();
        System.out.print("Enter number B: ");
        int b = scanner.nextInt();
         float result;
        switch (ope){
            case '+':
               result = a + b;
                System.out.println("Result is :"+ result);
                break;
            case '-':
                result = a -b;
                System.out.println("Result is :"+ result);
                break;
            case '*':
                result = a *b;
                System.out.println("Result is :"+ result);
                break;
            case '/':
                    result =a/b;
                    System.out.println("Result is :"+ result);
                    break;
            case '%':
                result = a%b;
                System.out.println("Result is :"+ result);
                break;
            default:
                System.out.println("Pls enter a valid input.");
                break;

        }
scanner.close();

        }
    }

