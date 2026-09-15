class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums,new ArrayList<>(), new HashSet<>(),result);
        return result;
    }
    void backtrack(int[] nums, List<Integer> current, HashSet<Integer> used, List<List<Integer>> result){
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!used.contains(nums[i])){
                current.add(nums[i]);
                used.add(nums[i]);

                backtrack(nums,current,used,result);
                current.remove(current.size() -1);
                used.remove(nums[i]);
            }
        }
    }
}
