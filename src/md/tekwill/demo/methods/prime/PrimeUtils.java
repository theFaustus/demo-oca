package md.tekwill.demo.methods.prime;

class PrimeUtils {


    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


    public static void printPrimeNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printTwinPrimeNumbers(int n) {
        int lastPrime = 1;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i) && (i - lastPrime == 2))
                System.out.println("(" + lastPrime + "," + i + ")");
            if (isPrime(i))
                lastPrime = i;
        }
    }

    public static void printEmirpPrimeNumbers(int n) {
        int howMany = 0;
        for (int i = 1; howMany <= n; i++) {
            if (isPrime(i)) {
                int reversed = reverse(i);
                if (isPrime(reversed)) {
                    System.out.print(i + " ");
                    howMany++;
                }
            }
        }
        System.out.println();
    }

    public static int reverse(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }


}
