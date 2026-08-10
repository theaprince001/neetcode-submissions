class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxLinearSum = Integer.MIN_VALUE;
        int minLinearSum = Integer.MAX_VALUE;
        int currentMax = 0;
        int currentMin = 0;

        for(int num : nums){
            totalSum += num;

            currentMax = Math.max(num, currentMax + num);
            maxLinearSum = Math.max(maxLinearSum, currentMax);

            currentMin = Math.min(num, currentMin + num);
            minLinearSum = Math.min(minLinearSum, currentMin);
        }

        if (maxLinearSum < 0) {
            return maxLinearSum;
        }

        return Math.max(maxLinearSum, totalSum - minLinearSum);
    }
}