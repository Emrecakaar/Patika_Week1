import java.util.Scanner;
public class BakkalAmca{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total;
        double sinir = 1000;
        double kdv1 = 0.18;
        double kdv2 = 0.8;
        double includedKdv;


        System.out.print("Para miktarını giriniz : ");
        total = input.nextDouble();


        System.out.println("Your total money : " + total);
        System.out.println("1000 lira ve altı tutarlarda kdv1 alınır : " + kdv1);
        System.out.println("1000 lira üzerindeki tutarlarda kdv2 alınır : " + kdv2);

        String note = total <= sinir ? "Ürününüz 1000 lira ve altı olduğu için : " + kdv1 : "Ürününüz 1000 lirayı üzerinde olduğu için : " + kdv2;
        System.out.println(note);

        includedKdv = total <= sinir ? kdv1 * total : kdv2 * total;
        System.out.println("KDV'li fiyatınız : " + includedKdv);

    }
}