package Java_Basic;

import java.util.Scanner;

public class inrtousd {
    public static void main(String[] args) {
        System.out.println("Enter inr to convert it in USD: ");
        Scanner num =new Scanner(System.in);
        float inr = num.nextFloat();
        float usd = inr / 90;

        System.out.print("Value of "+inr+" inr in usd is "+usd);


    }
}
