import java.util.Scanner;

public class TerstenUcgen {
    public static void main(String[] args) {
        int step;

// step kullanıcının kaç basamaklı üçgen oluşturmak istediğini soruyor.
        Scanner input = new Scanner(System.in);
        System.out.print("Bir basamak değeri giriniz : ");
        step = input.nextInt();

        // line'ı döngüde kullanabilmek için step ile eşitledim.
        int line = step;
        while (line != 0) {

            //space i step-line'a eşitleyip bir bir azaltıp ve döngüyü 0 ile eşit olmayana kadar
            //çalıştırarak oluşacak üçgende boşluklarımı oluşturdum.
            int space = step - line;
            while (space != 0) {
                System.out.print(" ");
                space--;


           // star ıma aşağıdaki değeri vererek oluşacak üçgenimi terse dönmesini sağladım.
            }
            int star = (2 * line) - 1;
            ;
            while (star != 0) {
                System.out.print("*");
                star--;
            }
            System.out.println();
            line--;
        }
    }
}
