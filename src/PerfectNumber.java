import java.util.Scanner;

/*4- Bir sayının mükemmel sayı olup olmadığı kontrol eden algoritma yazınız. */

public class PerfectNumber {

    public static void main(String[] args) {

        System.out.println("Enter a number");

        Scanner perfectScan = new Scanner(System.in);
        int perfectNum = perfectScan.nextInt();

        if (isPerfectNumber(perfectNum)) {
            System.out.println(perfectNum + " is a perfect number.");
        } else {
            System.out.println(perfectNum + " is not a perfect number");
        }
    }

    public static boolean isPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}
