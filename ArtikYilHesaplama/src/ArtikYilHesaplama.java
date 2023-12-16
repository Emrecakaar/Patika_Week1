import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int year;
// Kullanıcı 0'dan küçük değer girdiğinde 0'dan küçük tarih olamayacağı için hatalı giriş bildirisi yazdım.
        Scanner input = new Scanner(System.in);
        System.out.print("Bir yıl giriniz : ");
        year = input.nextInt();
        while (year < 0) {
            System.out.print("Hatalı giriş yaptınız ! Tarih 0'dan küçük olamaz. Geçerli bir tarih giriniz : ");
            year = input.nextInt();
        }
        // Artık yılın şartlarını "if ve else" yapısıyla yazarak kullanıcının isteğinin doğru yerine gelmesini sağladım.

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.print(year + " Bir artık yıldır.");

        } else {
            System.out.print(year + " Bir artık yıl değildir.");
        }
    }
}