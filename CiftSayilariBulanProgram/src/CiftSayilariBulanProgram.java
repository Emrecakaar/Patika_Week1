import java.util.Scanner;

public class CiftSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, average, kadar, sum = 0;

        // Kullanıcıdan bir sayı girmesini istiyorum.

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        // Kullanıcıdan aldığım sayıyı 3 ün ve 4 ün ortak en küçük katı olan 12 ye göre baz alarak yapıyorum.
        // i'yi 12 ile başlatıyorum ortalama da 0'ı da dahil etmesini istemedim.
        // count burada kaç sayının toplandığını bize belirtiyor.
        int i = 12;
        int count = 0;

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
