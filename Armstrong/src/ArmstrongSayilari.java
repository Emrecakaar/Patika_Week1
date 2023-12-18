import java.util.Scanner;

public class ArmstrongSayilari {
    public static void main(String[] args) {
        int number, basValue = 0, sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        number = input.nextInt();

// number değeri 0 olana kadar döngüyü devam ettirsin istiyorum.
        while (number != 0) {
            basValue = number % 10;// basamaklara ayırmak için kullandığım yöntem.
            sum += basValue;// basamaklara ayrılan sayıları topladığım yöntem.
            number /= 10;  // number ı sıfırlamak için kullandığım yöntem.
        }
        System.out.print("Toplam : " + sum);
    }

}
