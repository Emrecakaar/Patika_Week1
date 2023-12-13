import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

       /* burada "angleCircle" yani daire 360 derecelik açıya sahip olduğu için angleCircle
        değişkenime intenger veri tipiyle 360 değerini atadım.*/

        int radius,angleTriangle;
        double pi = 3.14;
        int angleCircle = 360;
        double area;

        System.out.print("Dairenin yarıçapını giriniz : ");
        radius=input.nextInt();

        System.out.print("Dairenin merkez açısını giriniz : ");
        angleTriangle=input.nextInt();

        area =(pi*(radius*radius)*angleTriangle)/360;
        System.out.print("Daire diliminin alanı : " + area);

    }
}