import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите номер месяца от 1 до 12: ");
            int n = scanner.nextInt();
            String[] month = {"", "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
            if (n > 0 && n < month.length) {
                System.out.println("Месяц "+month[n]);
                break;
            } else {
                System.out.println("Вы ввели не верные данные");
            }
        }
    }
}