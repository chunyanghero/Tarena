import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLEASE INPUT YOUR NAME: ");
        String name = scanner.next();
        System.out.println(name+" , WELCOME TO THE JAVA WORLD!");
    }
}
