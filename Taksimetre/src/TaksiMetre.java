import java.util.Scanner;
public class TaksiMetre {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        double km, perKm, total, startPrice;

        startPrice = 10;
        perKm = 2.20;

        System.out.print("Mesafenizi KM olarak yazınız : ");
        km = input.nextDouble();

        total = (perKm*km) + startPrice;

// Burada ki "20" bizim koşul olarak 20 tutar aşağısındaki totallerden de 20 lira alınmasını sağlamak.
        total = (total < 20) ? 20 : total;
        System.out.print(total);






    }
}
