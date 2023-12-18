import java.util.Scanner;

public class YildizlarlaUcgen {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir basamak değeri giriniz : ");
        number = input.nextInt();

        // yıldızla üçgen oluşturmak adına while döngüsünü seçtim.

        int line = 1;
        while (line <= number) {

            int space = 1;
            while (space <= (number - line)) {
                System.out.print(" ");
                space++;
            }
            int star = 1;
            while (star <= (2 * line) - 1) {
                System.out.print("*");
                star++;
            }
            System.out.println();
            line++; // Döngüm devam ederken satırı doğru oluşturabilmesi için line++ buraya ekledim.
        }

    }
}