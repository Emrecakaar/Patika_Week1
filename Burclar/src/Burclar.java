import java.util.Scanner;

public class Burclar {
    public static void main(String[] args) {
        int month, day;
        String horoscopes = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Hangi ayda doğduğunuzu giriniz : ");
        month = input.nextInt();

        while (month < 0  ||  12 < month ) {
            System.out.println("Hatalı giriş yaptınız! Bir yılda 12 ay vardır. Tekrar giriş yapınız.");
        month = input.nextInt();
        }

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
            } else {
                isError = true;
            }
        }
        if (month == 2) {
            if ((0 < day) && (day <= 28)) {
                if (day <= 20) {
                    horoscopes = "Kova burcusunuz";

                } else {
                    horoscopes = "Balık burcusunuz";

                }
            } else {
                isError = true;
            }

        }
        if (month == 3) {
            if ((0 < day) && (day <= 31)) {
                if (day <= 20) {
                    horoscopes = "Balık burcusunuz";

                } else {
                    horoscopes = "Koç burcusunuz";

                }
            } else {
                isError = true;
            }
        }
        if (month == 4) {
            if ((0 < day) && (day <= 30)) {
                if (day <= 20) {
                    horoscopes = "Koç burcusunuz";

                } else {
                    horoscopes = "Boğa burcusunuz";

                }
            } else {
                isError = true;
            }
        }
        if (month == 5) {
            if ((0 < day) && (day <= 31)) {
                if (day <= 21) {
                    horoscopes = "Boğa burcusunuz";

                } else {
                    horoscopes = "İkizler burcusunuz";

                }
            } else {
                isError = true;
            }
        }
        if (month == 6) {
            if ((0 < day) && (day <= 30)) {
                if (day <= 22) {
                    horoscopes = "İkizler burcusunuz";

                } else {
                    horoscopes = "Yengeç burcusunuz";

                }
            } else {
                isError = true;
            }

        }
        if (month == 7) {
            if ((0 < day) && (day <= 31)) {
                if (day <= 22) {
                    horoscopes = "Yengeç burcusunuz.";

                } else {
                    horoscopes = "Aslan burcusunuz.";

                }
            } else {
                isError = true;
            }
        }
        if (month == 8) {
            if ((0 < day) && (day <= 31)) {
                if (day <= 22) {
                    horoscopes = "Aslan burcusunuz.";

                } else {
                    horoscopes = "Başak burcusunuz.";

                }
            } else {
                isError = true;
            }
        }
        if (month == 9) {
            if ((0 < day) && (day <= 30)) {
                if (day <= 22) {
                    horoscopes = "Başak burcusunuz.";

                } else {
                    horoscopes = "Terazi burcusunuz.";

                }
            } else {
                isError = true;
            }
        }
        if (month == 10) {
            if ((0 < day) && (day <= 31)) {
                if (day <= 22) {
                    horoscopes = "Terazi burcusunuz.";

                } else {
                    horoscopes = "Akrep burcusunuz.";

                }
            } else {
                isError = true;
            }
        }
        if (month == 11) {
            if ((0 < day) && (day <= 30)) {
                if (day <= 21) {
                    horoscopes = "Akrep burcusunuz.";


                } else {
                    horoscopes = "Yay burcusunuz.";

                }
            } else {
                isError = true;
            }
        }
        if (month == 12) {
            if ((0 < day) && (day <= 31)) {
                if (day <= 21) {
                    horoscopes = "Yay burcusunuz.";

                } else {
                    horoscopes = "Oğlak burcusunuz.";

                }
            } else {
                isError = true;
            }
        }
        if (isError) {

            System.out.print("Hatalı giriş yaptınız.");

        } else {
            System.out.print("Burcunuz : " + horoscopes);


        }
    }

}