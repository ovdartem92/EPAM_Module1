import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner printer = new Scanner(System.in);
        System.out.print("Введите набор случайных цифр (аргументы командной строки): ");
        int number = printer.nextInt();
        int mirror = 0;
        while (number != 0) {
            mirror = mirror * 10 + (number % 10);
            number = number / 10;
        }

        System.out.print("Обратная последовательность введенных цифр (аргументов командной строки): " + mirror);
    }
}