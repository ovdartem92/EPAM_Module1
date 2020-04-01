import java.io.InputStream;
import java.util.*;

public class AppT {
    public static void print(Object obj){
        System.out.print(obj);
    } // Метод print
    public static void println(Object obj){
        System.out.println(obj);
    } // Метод println
    public static String[] readInput(Scanner sc) {
        List<String> input = new ArrayList<String>(); // ArrayList - это "прокаченный массив" с большим количеством возможностей
        print("Введите любые числа через пробел, для окончания введите q: ");
        while (sc.hasNext()) { //Следующий ввод данных через консоль
            String word = sc.next();
            if (word.equals("q")) {
                break;
            } else {
                input.add(word);
            }
        }
        sc.close();
        return toStringArray(input);
    } // Ввод данных через
    public static String[] readInput(InputStream is) {
        return readInput(new Scanner(is));
    }
    public static String[] toStringArray(Collection<String> list) {
        String[] result = new String[list.size()];
        Iterator<String> it = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            result[i] = it.next();
        }
        return result;
    }

    public static void findShortestAndLongestString(String[] sourceStrings) {
        String longest = sourceStrings[0];
        String shortest = sourceStrings[0];
        for (int i = 1; i < sourceStrings.length; i++) {
            if (shortest.length() > sourceStrings[i].length()) {
                shortest = sourceStrings[i];
            } else if (longest.length() < sourceStrings[i].length()) {
                longest = sourceStrings[i];
            }
        }
        println("Самая короткая строка (длина): " + shortest + "("
                + shortest.length() + ")");
        println("Самая длинная строка (длина): " + longest + "("
                + longest.length() + ")");
    }  // 1. Найти самую короткую и самую длинную строки.
    public static void findStringsLengthByAscAndDesc(String[] sourceStrings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : sourceStrings) {
            map.put(s, s.length());
        }
        println("Упорядоченные строки в порядке возрастания значений "
                + "их длины (строка=длина): "
                + sortStringsWithAscOrDescByLength(map, '<'));
        println("Упорядоченные строки в порядке убывания значений "
                + "их длины (строка=длина): "
                + sortStringsWithAscOrDescByLength(map, '>'));
    } // 2. Упорядочить и вывести строки в порядке возрастания (убывания)
    public static Map<String, Integer> sortStringsWithAscOrDescByLength(
            Map<String, Integer> map, char directionSign) {
        List<Map.Entry<String, Integer>> forSortBylength = new ArrayList<Map.Entry<String, Integer>>(
                map.entrySet());
        switch (directionSign) {
            case '>':
                Collections.sort(forSortBylength,
                        new Comparator<Map.Entry<String, Integer>>() {
                            public int compare(Map.Entry<String, Integer> o1,
                                               Map.Entry<String, Integer> o2) {
                                return ((Map.Entry<String, Integer>) (o2)).getValue()
                                        .compareTo(
                                                ((Map.Entry<String, Integer>) (o1))
                                                        .getValue());
                            }
                        });
                break;
            case '<':
                Collections.sort(forSortBylength,
                        new Comparator<Map.Entry<String, Integer>>() {
                            public int compare(Map.Entry<String, Integer> o1,
                                               Map.Entry<String, Integer> o2) {
                                return ((Map.Entry<String, Integer>) (o1)).getValue()
                                        .compareTo(
                                                ((Map.Entry<String, Integer>) (o2))
                                                        .getValue());
                            }
                        });
                break;
            default:
                System.err.print("Неверный знак сортировки: ");
                break;
        }
        Map<String, Integer> result = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : forSortBylength) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    private static String[] readInput() {
        return readInput(System.in);
    }
    public static void main(String[] args) {
        String[] sourceStrings = readInput(); // 0. Ввести n строк с консоли.
        if (sourceStrings.length == 0) {
            println("Нет строк. Программа завершена.");
            System.exit(0);
        }
        findShortestAndLongestString(sourceStrings); // 1. Найти самую короткую и самую длинную строки.
        findStringsLengthByAscAndDesc(sourceStrings); // 2. Упорядочить и вывести строки в порядке возрастания (убывания)
    }
}