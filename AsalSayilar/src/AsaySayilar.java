public class AsaySayilar {
    public static void main(String[] args) {

// Sayının asal olup olmadığını kontrol ediyorum.
        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            // Sayı asal ise burada program bize çıktı veriyor.
            if (isPrime) {
                System.out.println(number + " sayısı bir asal sayıdır.");

            }
        }
    }
}

