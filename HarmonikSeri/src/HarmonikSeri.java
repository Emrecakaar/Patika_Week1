import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        int number;
        double divisor = 1.0;
        double result = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir \"number\" değeri giriniz : ");
        number = input.nextInt();


        while (divisor <= number) {
            result += (1 / divisor);
            divisor++;


        }
        System.out.print(result);

    }
}
