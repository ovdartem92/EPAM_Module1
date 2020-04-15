import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RandomNumbers {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Random random = new Random();
    private int N = 0;
    private int[] myArray;
    public void setN() throws IOException {
        System.out.print("Введите количество случайных чисел: ");
        String s = reader.readLine();
        N = Integer.parseInt(s);
        myArray = new int[N];
    }
    public int getN(){
        return N;
    }
    public void setMyArray(int N){
        for (int i = 0; i < N; i++){
            myArray[i] = random.nextInt();
        }

    }
    public void showMyArray(){
        System.out.print("Массив случайных чисел без перехода на новую строку: ");
        for (int i = 0; i  < myArray.length; i++){
            System.out.print ( myArray[i] + " ");
        }
        System.out.println();
    }
    public void showLnMyArray(){
        System.out.println("Массив случайных числес с переходом на новую строку: ");
        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }
}
