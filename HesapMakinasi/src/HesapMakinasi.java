import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {

        // Basit işlemler yapılabilmesi için "double" yerine "int" veri tipiyle devam etmek istedim.

        int number1, number2, select;

        //Kullanıcının veri girebilmesi için scanner ile devam ediyorum.

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayınızı giriniz : ");
        number1 = input.nextInt();
        System.out.print("İkinci sayınızı giriniz : ");
        number2 = input.nextInt();

        //Kullanıcı yapmak istediği işlemi başındaki numarayı tıklayarak başlatmış olacaktır.

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçmek istediğiniz işlemin başındaki rakamı tuşlayınız : ");
        select = input.nextInt();

        //case 4 de bir sayı 0'a bölünemeyeceği için burada koşul operatörü kullanarak anlaşılmayan hatalardan kaçındım.

        /* default kısmında ise kullanıcı select değişkeni için sunulan 4 seçenek dışında başka bir seçenek sunduğunda
         programda hatalı giriş olarak görünmesini sağladım */

        switch (select) {
            case 1:
                System.out.print("İşlem sonucunuz : " + (number1 + number2));
                break;
            case 2:
                System.out.print("İşlem sonucunuz : " + (number1 - number2));
                break;
            case 3:
                System.out.print("İşlem sonucunuz " + (number1 * number2));
                break;
            case 4:
                System.out.print((number2 != 0) ? "İşlem sonucunuz + " + (number1 / number2) : "Bir sayı 0'a bölünemez!");
                break;
            default:
                System.out.print("Hatalı giriş yaptığınız için işlem gerçekleşemedi.");
        }


    }
}