package Java_Basic;//import java.util.Scanner;
//
//Take name as input and print a Java_Basic.greeting message.
//public class Java_Basic.greeting {
//    public static void main(String[] args) {
//        System.out.print("Pls Enter your name: ");
//        Scanner name = new Scanner(System.in);
//        Scanner name = name.next(String);
//        System.out.println("Hello" + name);}}
import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Hello, " + name + "!");
        input.close(); // still close it after use
    }
}

