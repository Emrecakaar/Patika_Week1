import java.util.Scanner;

public class BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        int a, b, c;


        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayınızı giriniz : ");
        a = input.nextInt();

        System.out.print("İkinci sayınızı giriniz : ");
        b = input.nextInt();

        System.out.print("Üçüncü sayınızı giriniz : ");
        c = input.nextInt();


        /* Kullanıcı a,b ve c ye değer atadıktan sonra koda sunulan if koşulları sayesinde sayılar
        büyükten küçüğe doğru sıralanıyor.*/


        if ((a > c) && (a > b)) {

            if ((b > c)) {
                System.out.print("Sayılarımızın büyükten küçüğe doğru sıralanışı : " + "a > b > c");

            } else {
                System.out.print("Sayılarımızın büyükten küçüğe doğru sıralanışı : " + "a > c > b");


            }
        } else if ((b > a) && (b > c)) {

            if ((a > c)) {
                System.out.print("Sayılarımızın büyükten küçüğe doğru sıralanışı : " + "b > a > c");

            } else {
                System.out.print("Sayılarımızın büyükten küçüğe doğru sıralanışı : " + "b > c > a");


            }
        } else if ((c > b) && (c > a)) {

            if ((b > a)) {
                System.out.print("Sayılarımızın büyükten küçüğe doğru sıralanışı : " + "c > b > a");

            } else {
                System.out.print("Sayılarımızın büyükten küçüğe doğru sıralanışı : " + "c > a > b");
            }
        }


    }

}
