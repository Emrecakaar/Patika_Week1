import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double weight , height, index ;

        System.out.print("Kilonuzu kilogram cinsinden giriniz : ");
        weight = input.nextDouble();

        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        height = input.nextDouble();

        index = weight / (height*height);
        System.out.print(index);

    }
}
