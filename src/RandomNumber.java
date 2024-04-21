import java.util.Random;
import java.util.Scanner;

  /*3-Kullanıcının 1 ile 10 arasında rastgele bir sayıyı tahmin etmesini isteyen ve doğru tahmin
        edene kadar devam eden bir program yazınız.(While döngüsü ile yapınız ve rastgele sayı üretmek
        için Random kütüphanesini kullanınız) */

public class RandomNumber {

    public static void main(String[] args) {

        System.out.println("Guessing number game");
        System.out.println("Please enter a number between 1 to 10");

        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;

        int num = 0;

        while(randomNumber != num) {
            Scanner guess = new Scanner(System.in);
            num = guess.nextInt();
            System.out.println("Try again");

        }
        System.out.println("Congratulations");
    }
}
