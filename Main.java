import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, What is your name?");
        String name = scanner.nextLine();

        System.out.println("Nice to meet you, " + name + "! How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Great! What is your favorite programming language?");
        String language = scanner.nextLine();

        System.out.println("Awesome! So, " + name + ", you are " + age + " years old and love " + language + ".");
        
        scanner.close();
    }
}
