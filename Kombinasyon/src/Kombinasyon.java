import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int factorial1 = 1, factorial2 = 1, factorial3 = 1, total, number1, number2, number3;


//Kullanıcıdan sayıları alıyorum.
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayınızı giriniz : ");
        number1 = input.nextInt();

        System.out.print("İkinci sayınızı giriniz : ");
        number2 = input.nextInt();

        // Verilen sayıların 0 dan küçük olarak hata vermesini önledim ve kullanıcıya hatalı giriş yaptığını belirttim.

        if (number1 > 0 && number2 > 0) {


            for (int i = 1; i <= number1; i++) {
                factorial1 *= i;

            }
            for (int i = 1; i <= number2; i++) {
                factorial2 *= i;

            }
            // faktorial3 ün eksi olmasını if ile önledim.
            if (number1 > number2) {
                number3 = number1 - number2;

            } else {
                number3 = number2 - number1;

            }
            for (int i = 1; i <= number3; i++) {
                factorial3 *= i;
            }

            total = factorial1 / factorial2 * factorial3;
            System.out.println("Kombinasyonumuz : " + total);

        } else {
            System.out.println("Hatalı giriş yaptınız!");
        }
    }

}
