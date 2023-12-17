import java.util.Scanner;

public class CiftVe4unKatlari {
    public static void main(String[] args) {
        int total = 0, number;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Bir sayı giriniz : ");
            number = input.nextInt();

            //Kullanıcının girdiği sayıları program çift sayı ve 4'ün katları olanları toplayarak totali verir.
            if ((number % 2 == 0) && (number % 4 == 0)) {
                total += number;

            }
            //Kullanıcı tek sayı girdiğinde program totali verir.
        } while (number % 2 == 0);

        System.out.println("Toplam : " + total);


    }
}
