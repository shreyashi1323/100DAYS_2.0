//User function template for Java
class Solution {
    public static void sort012(int a[], int n) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                count0++;
            } else if (a[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        int count = 0;

        for (int i = 0; i < count0; i++) {
            a[count] = 0;
            count++;
        }

        for (int i = 0; i < count1; i++) {
            a[count] = 1;
            count++;
        }

        for (int i = 0; i < count2; i++) {
            a[count] = 2;
            count++;
        }

    }
}
