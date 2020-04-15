import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int summa = 0;
        int multiply = 1;

        while (true) {
            System.out.print("Ввести целое положительное число: ");
            int nextInt = scanner.nextInt();
            if (nextInt > 0) {
                summa += nextInt % 10;
                multiply *= nextInt % 10;
                nextInt = nextInt / 10;
                System.out.println("Сумма: " + summa);
                System.out.print("Произведение: " + multiply);
                break;

            } else {
                System.out.println("Вы ввели не верные данные");
            }
        }
    }
}
