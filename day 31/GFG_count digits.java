class Solution {
    static int evenlyDivides(int n) {
        int count = 0;

        if (n == 0) {
            return 0;
        }
        
        int temp=n;

        while (temp != 0) {
            int digit = temp % 10;

         
            if (digit != 0 && n % digit == 0) {
                count++;
            }

            temp = temp / 10;
        }

        return count;
    }
}
