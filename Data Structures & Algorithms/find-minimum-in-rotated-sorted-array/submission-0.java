class Solution {
    public int findMin(int[] nums) {

        if (nums[0] <= nums[nums.length - 1]) {
            return nums[0];
        }


        int low = 0;
        int high = nums.length;
        while(low < high){
            int mid = low + (high - low) /2;
            
            if(nums[mid] >= nums[0]){
                low = mid +  1;
            }
            else {
                high = mid;
            }
        }
        return nums[low];
    }
}
