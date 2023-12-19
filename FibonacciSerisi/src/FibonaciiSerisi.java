import java.util.Scanner;

public class FibonaciiSerisi {
    public static void main(String[] args) {
        int limit, number1 = 0, number2 = 1, sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Serimiz için bir limit giriniz : ");
        limit = input.nextInt();

         /* Fibonacci serimi oluşturmak için for döngüsü kullanarak i mi limite eşit olana kadar arttırarak
         serimin döngü sonuna kadar devam etmesini sağlıyorum*/
        System.out.print("Fibonacci serimiz : ");
        for (int i = 1; i <= limit; i++) {
            System.out.print(number1 + " ");
            sum = number1 + number2;
            number1 = number2;
            number2 = sum;

        }
    }
}
