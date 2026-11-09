import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Задание 1. Введите строку минимум из 7 символов: ");
        String text = scanner.nextLine();
        // Позиции символов здесь нумеруются с 1: третий символ имеет индекс 2.
        if (text.length() >= 7) System.out.println("С 3-го по 7-й символ: " + text.substring(2, 7));
        else System.out.println("Строка слишком короткая.");

        System.out.print("Задание 2. Введите предложение: ");
        String sentence = scanner.nextLine().trim();
        if (sentence.isEmpty()) System.out.println("Предложение пустое.");
        else for (String word : sentence.split("\\s+")) System.out.println(word);

        String source = "aXa aXXa aXXXa aXXXXa aXXXXXa";
        System.out.println("Задание 3. Исходная строка: " + source);
        Matcher matcher = Pattern.compile("(?<!\\S)aX{2,4}a(?!\\S)").matcher(source);
        while (matcher.find()) System.out.println(matcher.group());
    }
}
