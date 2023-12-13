import java.util.Scanner;
public class IslemOnceligi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,result;

        System.out.print("a değerini giriniz :");
        a = input.nextDouble();

        System.out.print("b değerini giriniz :");
        b = input.nextDouble();

        System.out.print("c değerini giriniz :");
        c = input.nextDouble();

        result= a+b*c-b;
        System.out.print(result);

   }
}