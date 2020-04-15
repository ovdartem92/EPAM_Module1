package market;

import java.util.*;

public class Main {

    public static void println(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Shop megamarket = new Shop("Megamarket");
        megamarket.addCustomerToShopList(new Customer("Иван", "Дроздов", "Михайлович", "Украина", 11_22_33_44, 12345));
        megamarket.addCustomerToShopList(new Customer("Андрей", "Фамильян", "Иванович", "Россия", 22_33_44_55, 23456));
        megamarket.addCustomerToShopList(new Customer("Богдан", "Мурахоедов", "Франкович", "Болгария", 33_44_55_66, 34567));
        megamarket.addCustomerToShopList(new Customer("Виктор", "Викторян", "Викторович", "Украина", 44_55_66_77, 45678));
        megamarket.addCustomerToShopList(new Customer("Франк", "Ибрагимов", "Ибрагимович", "Латвия", 55_66_77_88, 56789));
        megamarket.addCustomerToShopList(new Customer("Наташа", "Дроздова", "Алексеевна", "Россия", 66_77_88_99, 67890));
        megamarket.addCustomerToShopList(new Customer("Оксана", "Ростинова", "Ростиславовна", "Украина", 77_88_99_00, 78901));
        megamarket.addCustomerToShopList(new Customer("Степан", "Боруков", "Алексеевич", "Россия", 88_99_00_11, 89012));
        megamarket.addCustomerToShopList(new Customer("Steeve", "Jackson", "<noname>", "USA", 99_00_11_22, 90123));
        megamarket.addCustomerToShopList(new Customer("Александр", "Добрынин", "Станиславович", "Украина", 10_12_23_34, 10234));

        println("\nsort by name:");
        List<Customer> listSortByName = megamarket.getListByName();
        listSortByName.forEach(Main::println);

        println("\nsort by surname:");
        List<Customer> listBySurname = megamarket.getListBySurname();
        for (Customer c : listBySurname) println(c);

        println("\nprint customers by diapazon credit card:");
        List<Customer> listSortByDiapazonCreditCard = megamarket.getListByDiapasonCreaditCard(22_33_44_55, 66_77_88_99);
        for (Customer c : listSortByDiapazonCreditCard) {
            println(c);
        }
    }
}



