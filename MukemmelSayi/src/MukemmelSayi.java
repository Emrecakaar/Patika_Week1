import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int number, sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        number = input.nextInt();

/* Kullanıcıdan aldığım sayıyı while döngüsüyle çarpanlarına ayırdım daha sonra toplayarak
  mükemmel sayı olup olmadığını belirledim. */
        int i = 1;
        while (i < number) {
            if (number % i == 0) {
                sum += i;

            }
            i++;
        }
        if (sum == number) {
            System.out.print(number + " Mükemmel sayıdır.");
        } else {
            System.out.print(number + " Mükemmel sayı değildir.");
        }
    }
}
