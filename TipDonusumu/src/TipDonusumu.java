import java.util.Scanner;

public class TipDonusumu {
    public static void main(String[] args) {
        int number1;
        double number2;
//Kullanıcıdan sayılar girmesini isteyerek bunu ekrana çıktı olarak veriyorum.
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        number1 = input.nextInt();
        System.out.println("Girdiğiniz sayı : " + number1);
// number1 sayısını dönüştürüyorum.
        double mutation1 = number1;

        System.out.print("İkinci sayıyı giriniz : ");
        number2 = input.nextInt();
        System.out.println("Girdiğiniz ikinci sayı : " + number2);
//number2 sayısını dönüştürüyorum.
        int mutation2 = (int) number2;
//Ekrana dönüşen sayıların dönüştüğü halini çıktı olarak yazıyorum.
        System.out.println("İlk sayının dönüşümü : " + mutation1);
        System.out.println("İkinci sayının dönüşümü : " + mutation2);


    }
}
