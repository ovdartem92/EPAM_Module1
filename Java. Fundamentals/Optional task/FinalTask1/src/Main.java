import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static jdk.nashorn.internal.objects.Global.print;

public class Main {
    public static void println(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) throws IOException {

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> listString = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        println("Введите n-количество цифр: ");
        println("Для выхода введите q.");
        while (true) {
            String word = reader.readLine();
            if (word.equals("q")) {
                break;
            } else {
                int n = Integer.parseInt(word);
                list.add(n);
                listString.add(word);
                println("Число " + n + " добавлено в список");
            }
        }

        println("Самое длинное число: " + Collections.max(list) + ". Колличество символов: " + String.valueOf(Math.abs(Collections.max(list))).length() + ".");
        println("Самое короткое число: " + Collections.min(list) + ". Колличество символов: " + String.valueOf(Math.abs(Collections.min(list))).length() + ".");
        println("");
        println("Сортировка по возрастанию чисел: ");
        Collections.sort(list);
        for (int counter : list) {
            println(counter);
        }
        println("");
        println("Сортировка по длинне строки: ");
        String[] arrayOfStrings = listString.toArray(new String[listString.size()]);
        for(int i = arrayOfStrings.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arrayOfStrings[j].length() > arrayOfStrings[j+1].length() ){
                    String tmp = arrayOfStrings[j];
                    arrayOfStrings[j] = arrayOfStrings[j+1];
                    arrayOfStrings[j+1] = tmp;
                }
            }
        }
        for(int i = 0; i < arrayOfStrings.length; i++){
            println(arrayOfStrings[i]);
        }
    }
}
