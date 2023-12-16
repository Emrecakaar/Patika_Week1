import java.util.Scanner;
public class CinZodyagiBurcu {
    public static void main(String[] args) {
        int date;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum tarihinizi giriniz : ");
        date = input.nextInt();

        if (date % 12 == 0) {
            System.out.print("Çin Zodyağı burcunuz : " + "Maymun");

        } else if (date % 12 == 1) {
            System.out.print("Çin Zodyağı burcunuz : " + "Horoz");

        } else if (date % 12 == 2) {
            System.out.print("Çin Zodyağı burcunuz : " + "Köpek");

        } else if (date % 12 == 3) {
            System.out.print("Çin Zodyağı burcunuz : " + "Domuz");

        } else if (date % 12 == 4) {
            System.out.print("Çin Zodyağı burcunuz : " + "Fare");

        } else if (date % 12 == 5) {
            System.out.print("Çin Zodyağı burcunuz : " + "Öküz");

        } else if (date % 12 == 6) {
            System.out.print("Çin Zodyağı burcunuz : " + "Kaplan");

        } else if (date % 12 == 7) {
            System.out.print("Çin Zodyağı burcunuz : " + "Tavşan");

        } else if (date % 12 == 8) {
            System.out.print("Çin Zodyağı burcunuz : " + "Ejderha");

        } else if (date % 12 == 9) {
            System.out.print("Çin Zodyağı burcunuz : " + "Yılan");

        } else if (date % 12 == 10) {
            System.out.print("Çin Zodyağı burcunuz : " + "At");

        } else if (date % 12 == 11) {
            System.out.print("Çin Zodyağı burcunuz : " + "Koyun");
        }

    }
}