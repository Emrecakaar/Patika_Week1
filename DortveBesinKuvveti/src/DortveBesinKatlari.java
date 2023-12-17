import java.util.Scanner;

public class DortveBesinKatlari {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        number = input.nextInt();

        for (int i = 1; i <= number; i *= 4) {
            System.out.println("4'ün kuvvetidir : " + i);
        }
        for (int i = 1; i <= number; i*=5 ){
            System.out.println("5'in kuvvetidir : " + i);
        }

    }
}