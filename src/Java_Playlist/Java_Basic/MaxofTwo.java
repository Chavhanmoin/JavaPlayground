package Java_Basic;

import java.util.Scanner;

public class MaxofTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number A: ");
        int a = scanner.nextInt();

        System.out.print("Enter number B: ");
        int b = scanner.nextInt();
        if (a > b){
            System.out.println("A is greater");
        }
        else if (b>a)
        {
            System.out.println("B is greater");
        }
        else {
            System.out.println("A and B both are equal.");
        }

scanner.close();
    }
}
