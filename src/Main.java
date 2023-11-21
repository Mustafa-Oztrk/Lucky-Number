import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Merhaha Uğurlu sayını Öğrenmeye hazır mısın?");

       Random random = new Random();

        int luckNumber = random.nextInt(1,100);

        System.out.println("Şanslı Sayınız : " + luckNumber);

    }
}