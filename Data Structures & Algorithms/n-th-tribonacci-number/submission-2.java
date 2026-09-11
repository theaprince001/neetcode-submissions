class Solution {
    public int tribonacci(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return helper(n, map);
    }
    public int helper(int n, HashMap<Integer, Integer> map){
        if(map.containsKey(n)){
            return map.get(n);
        }
        if(n == 0) return 0;
        if(n == 1 || n ==2) return 1;

        int result = helper(n-1,map)+helper(n-2,map)+helper(n-3,map);
        map.put(n, result);
        return result;
    }
}