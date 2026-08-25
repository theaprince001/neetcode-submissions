class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            while(!stack.empty() && temperatures[i] > temperatures[stack.peek()]){
                int poppedIndex = stack.pop();
                ans[poppedIndex] = i - poppedIndex;
            }
            stack.push(i);
        }
        return ans;
    }
}
