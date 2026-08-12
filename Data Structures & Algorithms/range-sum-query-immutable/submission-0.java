class NumArray {
    int[] presum;
    public NumArray(int[] nums) {
        presum = nums;
        for(int i = 1; i < presum.length; i++){
            presum[i] += presum[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        return (left == 0) ? presum[right] : presum[right] - presum[left -1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */