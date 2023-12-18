import java.util.Scanner;

public class Bankamatik {
    public static <balance> void main(String[] args) {
        int right = 3;
        Scanner input = new Scanner(System.in);
        String userName, password;
        double balance = 3000, price;
        int select;
// Kullanıcı adı ve şifreyi burada kullanıcıdan istiyorum ve ilk if koşulumda ikisinin de doğruluğunu kontrol ediyorum.

        while (right > 0) {
            System.out.print("Kullanıcı adını giriniz : ");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz : ");
            password = input.nextLine();

// Kullanıcı doğru girdikten sonra anasayfa olarak kullanıcıya belirli seçenekler sunuyorum.
            if (userName.equals("emre") && password.equals("1975")) {
                System.out.println("1 - Bakiyenizi sorgulama\n" +
                        "2 - Para yatırmak\n" +
                        "3 - Para çekmek\n" +
                        "4 - Çıkış yapmak");
                System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
                select = input.nextInt();

                // Seçilen seçeneklere göre yapılabilecek adımları switch-case ile uyguladım.

                switch (select) {

                    case 1:
                        System.out.print("Bakiyeniz : " + balance);
                        break;
                    case 2:
                        System.out.print("Yatırmak  istediğiniz para miktarını giriniz : ");
                        price = input.nextDouble();

                        balance += price;
                        System.out.print("Yeni bakiyeniz : " + balance);
                        break;
                    case 3:
                        System.out.print("Çekmek istediğiniz para miktarını giriniz : ");
                        price = input.nextDouble();
                        if (price > balance) {
                            System.out.println("Bakiyeniz yetersiz.");
                        } else {
                            balance -= price;
                            System.out.println("Yeni bakiyeniz : " + balance);
                        }

                        break;
                    case 4:
                        System.out.print("Bizi tercih ettiğiniz için teşekkürler! Tekrar görüşmek dileğiyle.");
                }
                break;
                // Kullanıcıya 3 hak verdim ve 3 hakkı bittiğinde ne yapabilir yol gösterdim.
            } else {
                while (right != 0) {
                    right--;
                    System.out.println("Bilgilerinizi yanlış girdiniz! Lütfen tekrar deneyiniz.");
                    System.out.println("Kalan doğru girme hakkınız : " + right);
                    break;
                }
            }
            if (right == 0) {
                System.out.print("Hesabınız bloke edilmiştir. En yakın şubemize uğrayabilirsiniz. ");

            }
        }
    }
}
