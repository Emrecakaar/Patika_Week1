import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HavaSicakligi {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz : ");
        heat = input.nextInt();

// Burada eşitlikleri sadece ortak olan sıcaklık değerine vererek karışıklığı önledim.

        if (heat == 25) {
            System.out.print("Bugün hem Yüzmeye gidebilirsiniz hemde Piknik yapabilirsiniz.");

        } else if (heat > 25) {
            System.out.print("Bugün Yüzmeye gidebilirsiniz.");

        }
        if (heat == 15) {
            System.out.print("Hem Pikniğe gidebilirsiniz hemde Yüzmeye gidebilirsiniz.");

        } else if (heat < 25 && heat > 15) {
            System.out.print("Bugün piknik yapabilirsiniz.");

        } else if (heat < 15 && heat > 5) {
            System.out.print("Bugün sinemaya gidebilirsiniz.");


        }
        if (heat == 5) {
            System.out.print("Hem Sinemaya gidebilirsiniz hemde Kayak yapabilirsiniz.");

        } else if (heat < 15 && heat > 5) {
            System.out.print("Bugün sinemaya gidebilirsiniz.");


        } else if (heat < 5) {
            System.out.print("Bugün Kayak yapabilirsiniz.");

        }
    }
}