package Java_Basic;

import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        System.out.print("Enter radius of circle: ");
        Scanner scanner = new Scanner(System.in);
        float radius = scanner.nextFloat();
        double area = 3.14 *(radius*radius);
        System.out.print("Area of circle is "+area);
    }
}
