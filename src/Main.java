import java.util.Scanner;

 /*1- kullanıcıdan kaç ürün almak istediğini soran,her ürünün fiyatını alarak toplam alışveriş
        tutarını hesaplayan bir algoritma yazınız.(Input için Scanner ve döngü için for döngüsü kullanınız)  */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many products do you want to buy?");
        int number = scan.nextInt();
        int totalAmount = 0;

        for (int i = 0; i < number; i++) {
            System.out.println("Enter the price of " + (i + 1) + ". product:");
            int amount = scan.nextInt();
            totalAmount += amount;
        }

        System.out.println("Total amount: " + totalAmount);

        scan.close();
    }
}