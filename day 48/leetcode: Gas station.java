class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0;
        int currentGas = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            int netGas = gas[i] - cost[i];
            totalGas += netGas;
            currentGas += netGas;

            // If currentGas becomes negative, reset to 0 and update start station
            if (currentGas < 0) {
                currentGas = 0;
                start = i + 1;
            }
        }

        // If totalGas is non-negative, a solution exists, return the start index
        return totalGas >= 0 ? start : -1;
    }}
