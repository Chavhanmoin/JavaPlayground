package Java_Basic;

import java.util.Scanner;

public class addnum {
    public static void main(String[] args) {
        System.out.print("Enter number A: ");
        Scanner num = new Scanner(System.in);
        int a =num.nextInt();

        System.out.print("Enter number B: ");
        int b =num.nextInt();

        int sum = a + b;
        System.out.println("Additon of A and B is:" + sum);

    }
}
