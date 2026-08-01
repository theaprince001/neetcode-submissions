class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int i = 1; i < s.length(); i++){
            int first = s.charAt(i-1);
            int second = s.charAt(i);
            sum += Math.abs(first - second);
        }
        return sum;
    }
}