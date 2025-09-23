package Java_Basic;

import java.util.Scanner;

public class VolumeofCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of cylinder: ");
        float radius = scanner.nextFloat();
        System.out.print("Enter height of cylinder: ");
        float height = scanner.nextFloat();
        double volume = Math.PI*height*(radius*radius);
        System.out.printf("Volume of cylinder is %.2f ",volume);
        scanner.close();
    }
}
