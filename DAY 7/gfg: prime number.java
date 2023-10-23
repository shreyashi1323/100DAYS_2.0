class Solution {
    static int isPrime(int n) {
        if (n <= 1) {
            return 0; // 0 and 1 are not prime numbers
        }
        if (n <= 3) {
            return 1; // 2 and 3 are prime numbers
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return 0; // Divisible by 2 or 3
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return 0; // Divisible by (i) or (i + 2)
            }
        }

        return 1; // If none of the above conditions are met, n is prime
    }
}
