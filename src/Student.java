import java.util.Scanner;

/*6- kullanıcıdan öğrenci sayısını isteyen her öğrenci için öğrenci adı,öğrenci soyadı,1.sınav notu,
 2.sınav notu,3.sınav notu isteyen ve daha sonra not ortalamasını hesaplayıp ekrana yazdıran
 algoritma yapınız.(For döngüsü kullanınız) */

public class Student {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of students");
        int numberOfStudents = scanner.nextInt();

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("Please enter " + i + ". student's name");
            String nameOfStudent = scanner.next();

            System.out.println("Please enter " + i + ". student's lastname");
            String lastNameOfStudent = scanner.next();

            int total = 0;
            for (int j = 1; j <= 3; j++) {
                System.out.println("Enter " + j + ". grade");
                int grade = scanner.nextInt();
                total += grade;
            }
            double avg = (double) total / 3;

            System.out.println(nameOfStudent + " " + lastNameOfStudent + " " + avg);
        }

        scanner.close();
    }
}