package Java_Basic;

import java.util.Scanner;

public class Perimeterofsquare {
    public static void main(String[] args) {
        System.out.print("Enter side of square: ");
        Scanner scanner = new Scanner(System.in);
        float side = scanner.nextFloat();
        double perimeter = 4*side;
        System.out.print("Perimeter of square is "+perimeter);
}}
