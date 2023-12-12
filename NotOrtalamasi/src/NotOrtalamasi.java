import java.util.Scanner;

 public class NotOrtalamasi{
    public static void main(String[] args) {
        int math, physics, chemistry, turkish, history , music;
        Scanner input = new Scanner(System.in);

        System.out.print("Your Math result is :");
        math = input.nextInt();

        System.out.print("Your Physics result is : ");
        physics = input.nextInt();

        System.out.print("Your Chemistry result is : ");
        chemistry = input.nextInt();

        System.out.print("Your Turkisch result is : ");
        turkish = input.nextInt();

        System.out.print("Your History result is : ");
        history = input.nextInt();

        System.out.print("Your Musik result is : ");
        music = input.nextInt();

        /* Matematiği önemli bir ders haline getirip matematiktende 60 altı alan öğrencileri
        Sınıfta kaldı olarak gösterdim.*/
        int result = (math + physics + chemistry + turkish + history + music);
        double yourGrade = result / 6.0;
        System.out.print(yourGrade);
        /* Geçme notumuzu burada double veri tipinde değişkenimize 60.0 değerini atadım.
        Çünkü yourGrade burada ondalıklı bir sayı çıkabilir.*/
        double succesfullyGrade= 60.0;
        boolean condition = succesfullyGrade <= yourGrade;
        boolean condition2 = succesfullyGrade <= math;
        boolean condition3 = condition && condition2;
        String decision = condition3 ? " Sınıfı geçti." : " Sınıfta kaldı.";
        System.out.print(decision);
    }
}