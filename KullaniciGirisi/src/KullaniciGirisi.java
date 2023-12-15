import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, resetPassword;
        int select;

// Uygulamaya giriş öncesi kullanıcı bilgilerini buradan doğrulayacak.
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        password = input.nextLine();

        /*Burada kullanıcı adını "emre" ve şifreyi "2023" olarak tanımladım.
        Bu bilgiler dışındaki bilgiler kabul edilmeyecektir. Kullanıcıdan yeni oluşturması istenilecektir.*/

        if (userName.equals("emre") && password.equals("2023")) {
            System.out.println("Bilgilerinizi doğru girdiniz. ");

        } else {
            System.out.print("Bilgilerinizi yanlış girdiniz.");

            System.out.println("\n1-Şifre belirlemek istemiyorum\n2-Şifre belirlemek istiyorum.");
            System.out.print("Tercihinizi buraya giriniz : ");
            select = input.nextInt();
            input.nextLine();


            switch (select) {
                case 1:
                    System.out.print("Şifrenizi tekrar kontrol ediniz.");
                    break;
                case 2:
                    System.out.println("Yeni şifreniz girdiğiniz hatalı şifre ve unuttuğunuz şifre ile aynı olmamalıdır!");

                    System.out.print("Yeni şifrenizi belirleyiniz : ");
                    resetPassword = input.nextLine();

// Buradaki amacım kullanıcının hatalı girdiği ve eski şifresi yeni şifre olarak kabul edilmemesidir.
                    if (resetPassword.equals(password) || (resetPassword.equals("2000"))) {
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz. ");

                    } else {
                        System.out.println("Şifre oluşturuldu. ");
                    }
                    break;

            }
        }


    }
}
