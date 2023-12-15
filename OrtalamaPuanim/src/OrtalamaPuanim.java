import java.util.Scanner;

public class OrtalamaPuanim {
    public static void main(String[] args) {
        int mathematics, physics, turkish, chemistry, music;

        /* Burada "while" ile kullanıcının 0 ile 100 değeri arasında olmayan bir değer kullanarak sonucu
        etkilemesinden kaçındım. */


        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        mathematics = input.nextInt();

        while (mathematics < 0 || 100 < mathematics) {
            System.out.println("Lütfen 0 ile 100 arasında olan notları giriniz.");
            mathematics = input.nextInt();
        }

        System.out.print("Fizik notunuzu giriniz : ");
        physics = input.nextInt();

        while (physics < 0 || 100 < physics) {
            System.out.println("Lütfen 0 ile 100 arasında olan notları giriniz.");
            physics = input.nextInt();
        }
        System.out.print("Türkçe notunuzu giriniz : ");
        turkish = input.nextInt();

        while (turkish < 0 || 100 < turkish) {
            System.out.println("Lütfen 0 ile 100 arasında olan notları giriniz.");
            turkish = input.nextInt();
        }

        System.out.print("Kimya notunuzu giriniz : ");
        chemistry = input.nextInt();

        while (chemistry < 0 || 100 < chemistry) {
            System.out.println("Lütfen 0 ile 100 arasında olan notları giriniz.");
            chemistry = input.nextInt();

        }

        System.out.print("Müzik notunuzu giriniz : ");
        music = input.nextInt();

        while (music < 0 || 100 < music) {
            System.out.println("Lütfen 0 ile 100 arasında olan notları giriniz.");
            music = input.nextInt();
        }

        System.out.println("Matematik notunuz " + mathematics);
        System.out.println("Fizik notunuz " + physics);
        System.out.println("Türkçe notunuz " + turkish);
        System.out.println("Kimya notunuz " + chemistry);
        System.out.println("Müzik notunuz " + music);


        double average;
        average = ((mathematics + physics + turkish + chemistry + music) / 5.0);

        String result = (average >= 55) ? "Tebrikler sınıfı geçtiniz." : "Sınıfta kaldınız.";

        System.out.println(result);
        System.out.println("Ortalamanız " + average);


    }

}
