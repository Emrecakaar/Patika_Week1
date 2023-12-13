import java.util.Scanner;
public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        Scanner cozum = new Scanner(System.in);

        /* Öncelikle a,b,c ve d değerinde değişkenlerimi kullanıcı daha rahat değer atayabilmesi için
         double veri tipiyle giriyorum. "alan" ve "cevre" değişkenlerimi de çıkacak sonuçta hata almamak adına
         double veri tipiyle giriyorum. */
        double a, b, d;
        double hipotenus;
        double alan;
        double cevre;

        System.out.print("A kenarını giriniz : ");
        a = cozum.nextDouble();

        System.out.print("B kenarını giriniz : ");
        b = cozum.nextDouble();

        System.out.print("Hipotenüsü giriniz : ");
        hipotenus = cozum.nextDouble();

        cevre = a + b + hipotenus;
        System.out.println("Üçgenimizin çevresi : " + cevre);

        // d değişkenini alanda kullanacağımız formülde ihtiyacımız olduğu için double veri tipiyle atadım.
        d = cevre / 2;

        // Burada alan formulünü kullanarak girilen değerler sonucunda üçgenimizin alanı hesaplanıyor.
        alan = Math.sqrt(d * (d - a) * (d - b) * (d - hipotenus));
        System.out.println("Üçgenimizin alanı : " + alan);
    }
}