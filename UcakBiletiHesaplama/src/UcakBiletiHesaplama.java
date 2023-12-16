import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {

        double km, perKm, price, firstSale, totalPrice, sale;
        int age, tripType;
        perKm = 0.10;

        /* Burada kullanıcıdan alınan verilerin şartları sağlayabilmesi için "while" ı kullandım.
        Kullanıcı istenilen aralıkta bir değer atamadığında hatayla karşılaşacaktır.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafenizi kilometre cinsinden giriniz : ");
        km = input.nextDouble();
        while (km < 0) {
            System.out.println("Hatalı giriş yaptınız! Mesafe 0'dan küçük olamaz.");
            km = input.nextDouble();
        }
        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();
        while (age < 0) {
            System.out.println("Hatalı giriş yaptınız! Yaşınız 0'dan küçük olamaz.");
            age = input.nextInt();
        }
        System.out.println("\n1-Tek yön\n2-Gidiş-Dönüş");
        System.out.print("Seçiminizi giriniz : ");
        tripType = input.nextInt();
        while (tripType < 1 || 2 < tripType) {
            System.out.println("Hatalı giriş yaptınız! Sadece iki seçeneğiniz vardır.");
            tripType = input.nextInt();
        }
/* Öncelikle mesafeye göre oluşan tutarı hesaplayıp daha sonra kullanıcının yaş durumuna ve yolculuk
tipine göre kazandığı indirimleri fiyat üzerinde işleyerek kullanıcıya ödemesi gereken tutarı oluşturdum.
Ve kullanıcıya yaşı dolayısıyla oluşan indirimi belirtmek istedim.
 */
        price = perKm * km;

        if (age < 12 && tripType == 2) {
            sale = price *0.5;
            firstSale = price - (price * 0.5);
            totalPrice = firstSale - (firstSale * 0.2);

            System.out.println("İndirimsiz mesafenizin tutarı : " + price);
            System.out.println("Yaşınızdan dolayı oluşan indirim tutarınız : " + sale);
            System.out.println("İndirimler sonrasında ödeyeceğiniz tutar : " + totalPrice);

        } else if (age < 12) {
            sale = price * 0.5;
            totalPrice = price - (price * 0.5);
            System.out.println("İndirimsiz mesafenizin tutarı : " + price);
            System.out.println("Yaşınızdan dolayı oluşan indirim tutarınız : " + sale);
            System.out.println("İndirimler sonrasında ödeyeceğiniz tutar : " + totalPrice);

        }
        if (12 <= age && age <= 24 && tripType == 2) {
            sale = price * 0.1;
            firstSale = price - (price * 0.1);
            totalPrice = firstSale - (firstSale * 0.2);

            System.out.println("İndirimsiz mesafenizin tutarı : " + price);
            System.out.println("Yaşınızdan dolayı oluşan indirim tutarınız : " + sale);
            System.out.println("İndirimler sonrasında ödeyeceğiniz tutar : " + totalPrice);



        } else if (12 <= age && age <= 24) {
            sale = price * 0.1;
            totalPrice = price - (price * 0.1);
            System.out.println("İndirimsiz mesafenizin tutarı : " + price);
            System.out.println("Yaşınızdan dolayı oluşan indirim tutarınız : " + sale);
            System.out.println("İndirimler sonrasında ödeyeceğiniz tutar : " + totalPrice);

        }

        if (65 < age && tripType == 2) {
            sale = price * 0.3;
            firstSale = price - (price * 0.3);
            totalPrice = firstSale - (firstSale * 0.2);
            System.out.println("İndirimsiz mesafenizin tutarı : " + price);
            System.out.println("Yaşınızdan dolayı oluşan indirim tutarınız : " + sale);
            System.out.println("İndirimler sonrasında ödeyeceğiniz tutar : " + totalPrice);

        } else if (65 < age) {
            sale = price * 0.3;
            totalPrice = price - (price * 0.3);
            System.out.println("İndirimsiz mesafenizin tutarı : " + price);
            System.out.println("Yaşınızdan dolayı oluşan indirim tutarınız : " + sale);
            System.out.println("İndirimler sonrasında ödeyeceğiniz tutar : " + totalPrice);

        }
    }
}