import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите своё имя: ");
        Scanner input = new Scanner(System.in);
        String name = input.hasNextLine() ? input.nextLine().trim() : "";
        if (name.isEmpty()) name = "Имя";
        System.out.println("Hello, " + name);
    }
}
