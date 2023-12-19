import java.util.Scanner;

public class KucukVeBuyukSayilariBulma {
    public static void main(String[] args) {
        // maximum ve minimum değerlere minimum ve maximum integer atıyorum.
        int limit, number, maximum = Integer.MIN_VALUE, minimum = Integer.MAX_VALUE;

// Kullanıcıdan girmek istediği sayı miktarını öğrenip bir limit oluşturuyorum.
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceğinizi belirtiniz : ");
        limit = input.nextInt();

        //i yi kullanıcıya kolaylık sağlamak; kullanıcının kaçıncı sayıyı girdiğini göstermek için ekliyorum.
        int i = 1;
        while (limit != 0) {
            System.out.println(i + " .Sayınızı giriniz : ");
            number = input.nextInt();
            limit--;

// Verilen sayıları burada koşula koyarak en büyük ve en küçük sayının bulmasını sağladım.
            if (maximum < number) {
                maximum = number;
            }
            if (minimum > number) {
                minimum = number;

            }
            i++;

        }
        System.out.println("En büyük sayı : " + maximum);
        System.out.println("En küçük sayı : " + minimum);

    }

}
