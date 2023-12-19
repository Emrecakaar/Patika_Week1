import java.util.Scanner;

public class KucukVeBuyukSayilariBulma {
    public static void main(String[] args) {
        int limit, number, maximum = Integer.MIN_VALUE, minimum = Integer.MAX_VALUE;


        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceğinizi belirtiniz : ");
        limit = input.nextInt();
        int i = 1;
        while (limit != 0) {
            System.out.println(i + " .Sayınızı giriniz : ");
            number = input.nextInt();
            limit--;

            if (maximum < number) {
                maximum = number;
            }
            if (minimum > number) {
                minimum = number;

            }
            i++;

        }
        System.out.println("En büyük sayı : " + maximum);
        System.out.println("En küçük sayı : " + minimum);

    }

}
