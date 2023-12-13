import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double pear, apple, tomatoes, banana, aubergine;
        double kilopear, kiloapple, kilotomatoes,kilobanana,kiloaubergine;
        double totalpear, totalapple, totaltomatoes,totalbanana, totalaubergine, totalpreice;

        pear = 2.14;
        apple = 3.67;
        tomatoes = 1.11;
        banana = 0.95;
        aubergine = 5.00;

        System.out.print("Armut'un kilosunu(kg) giriniz : ");
        kilopear = input.nextDouble();

        System.out.print("Elma'nın kilosunu(kg) giriniz : ");
        kiloapple = input.nextDouble();

        System.out.print("Domatesin kilosunu(kg) giriniz : ");
        kilotomatoes = input.nextDouble();

        System.out.print("Muz'un kilosunu(kg) giriniz : ");
        kilobanana = input.nextDouble();

        System.out.print("Patlıcanın kilosunu(kg) giriniz : ");
        kiloaubergine = input.nextDouble();

        totalpear = kilopear * pear;
        totalapple = kiloapple * apple;
        totaltomatoes = kilotomatoes * tomatoes;
        totalbanana = kilobanana * banana;
        totalaubergine = kiloaubergine * aubergine;

        totalpreice = totalpear + totalapple + totaltomatoes + totalbanana + totalaubergine;

        System.out.print("Toplam tutarınız :" + totalpreice);
    }
}
