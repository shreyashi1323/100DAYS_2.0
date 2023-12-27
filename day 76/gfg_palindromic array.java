class GfG {
    public static int palinArray(int[] arr, int n) {
        int count = 0; // Initialize count to 0

        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            int rev = 0;

            while (temp != 0) {
                int rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
            }

            if (rev == arr[i]) {
                count++;
            }
        }

        if (count == n) {
            return 1;
        } else {
            return 0; 
        }
    }
}
