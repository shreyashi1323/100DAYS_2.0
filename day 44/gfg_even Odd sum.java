class Solution {
    ArrayList<Integer> EvenOddSum(int N, int Arr[]) {
        // code here
        ArrayList<Integer> sumList = new ArrayList<>();
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                evenSum += Arr[i];
            } else {
                oddSum += Arr[i];
            }
        }

       
        sumList.add(evenSum);

 sumList.add(oddSum);
        return sumList;
    }
}
