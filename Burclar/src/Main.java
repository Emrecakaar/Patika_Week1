import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int month, day;
        String horoscopes = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Hangi ayda doğduğunuzu giriniz : ");
        month = input.nextInt();
        System.out.print("Hangi günde doğduğunuzu giriniz : ");
        day = input.nextInt();

        //Kullanıcı hangi ay ve günde doğduğunu girerek


        if (month == 1) {
            if ((0 < day) && (day <= 31)) {
                if (day <= 21) {
                    horoscopes = "Oğlak burcusunuz";

                } else {
                    horoscopes = "Kova burcusunuz";

                }

            }
        }
        if (month == 2) {
            if ((0 < day) && (day <= 28)) {
                if (day <= 20) {
                    horoscopes = "Kova burcusunuz";

                } else {
                    horoscopes = "Balık burcusunuz";

                }
            }

        }
        if (month == 3) {
            if ((0 < day) && (day <= 31)) {
                if (day <= 20) {
                    horoscopes = "Balık burcusunuz";

                } else {
                    horoscopes = "Koç burcusunuz";

                }
            }

        }
        if (month == 4) {
            if ((0 < day) && (day <= 30)) {
                if (day <= 20) {
                    horoscopes = "Koç burcusunuz";

                } else {
                    horoscopes = "Boğa burcusunuz";

                }
            }
        }
        if (month == 5) {
            if ((0 < day) && (day <= 31)) {
                if (day <= 21) {
                    horoscopes = "Boğa burcusunuz";

                } else {
                    horoscopes = "İkizler burcusunuz";

                }
            }

        }
        if (month == 6) {
            if ((0 < day) && (day <= 30)) {
                if (day <= 22) {
                    horoscopes = "İkizler burcusunuz";

                } else {
                    horoscopes = "Yengeç burcusunuz";

                }
            }

        }
        if (month == 7) {
            if ((0 < day) && (day <= 31)) {
                if (day <= 22) {
                    horoscopes = "Yengeç burcusunuz.";

                } else {
                    horoscopes = "Aslan burcusunuz.";

                }
            }

        }
        if (month == 8) {
            if ((0 < day) && (day <= 31)) {
                if (day <= 22) {
                    horoscopes = "Aslan burcusunuz.";

                } else {
                    horoscopes = "Başak burcusunuz.";

                }
            }

        }
        if (month == 9) {
            if ((0 < day) && (day <= 30)) {
                if (day <= 22) {
                    horoscopes = "Başak burcusunuz.";

                } else {
                    horoscopes = "Terazi burcusunuz.";

                }
            }

        }
        if (month == 10) {
            if ((0 < day) && (day <= 31)) {
                if (day <= 22) {
                    horoscopes = "Terazi burcusunuz.";

                } else {
                    horoscopes = "Akrep burcusunuz.";

                }
            }

        }
        if (month == 11) {
            if ((0 < day) && (day <= 30)) {
                if (day <= 21) {
                    horoscopes = "Akrep burcusunuz.";


                } else {
                    horoscopes = "Yay burcusunuz.";

                }
            }

        }
        if (month == 12) {
            if ((0 < day) && (day <= 31)) {
                if (day <= 21) {
                    horoscopes = "Yay burcusunuz.";

                } else {
                    horoscopes = "Oğlak burcusunuz.";

                }
            }
        }
        if ((isError = true)) {

            System.out.print("Hatalı giriş yaptınız.");

        } else {
            System.out.print("Burcunuz : " + horoscopes);


        }
    }

}