import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        RandomNumbers num = new RandomNumbers();
        num.setN();
        num.setMyArray(num.getN());
        num.showMyArray();
        num.showLnMyArray();
    }
}