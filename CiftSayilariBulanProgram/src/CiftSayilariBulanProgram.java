import java.util.Scanner;

public class CiftSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, average, kadar, sum = 0;

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();
        int i = 12;

        int count = 0; // Count of numbers

        do {
            sum += i;
            i += 12;
            count++;

        } while (i <= number);

        if (count != 0) {
            average = sum / count;

            System.out.println("Ortalama: " + average);
        } else {
            System.out.println("Geçerli bir sayı girmediniz.");
        }
    }
}
