import java.util.Scanner;

public class EbobveEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk değeri giriniz : ");
        int number1 = input.nextInt();

        System.out.print("İkinci değeri giriniz : ");
        int number2 = input.nextInt();

        // Burada sayılarım döngü içerisine girmesini istediğim için değer veriyorum.
        int ekok = 1;
        int ebob = 1;
        int part = 1;
        // if koşuluyla hangi sayı daha büyükse partı sınırlayıp ona göre işlem yapılmasını istiyorum.
        if (number1 <= number2) {
            while (part <= number1) {
                if (number1 % part == 0 && number2 % part == 0) {
                    ebob = part;
                }
                part++;
            }
            System.out.print(ebob);
        } else {
            while (part <= number2) {
                if (number1 % part == 0 && number2 % part == 0) {
                    ebob = part;
                }
                part++;
            }
            System.out.print(ebob);

        }
        System.out.println();
        // Burada while döngüsüyle ekok bulma işlemi yapıyorum.

        while (part <= (number1 * number2)) {
            if (part % number1 == 0 && part % number2 == 0) {
                ekok = part;
                System.out.print(ekok);
                break;
            }
            part++;
        }

    }
}
