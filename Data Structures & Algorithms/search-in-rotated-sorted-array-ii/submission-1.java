class Solution {
    public boolean search(int[] n, int target) {
        int low = 0;
        int high = n.length-1;
        int mid = 0;
        while(low<=high){
            mid = low+(high-low)/2;
            if(n[mid]==target){
                return true;
            }
            if(n[low]==n[mid] && n[mid]==n[high]){
                low++;
                high--;
            }
            else if(n[low]<=n[mid]){
                if(target>=n[low] && target<n[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(target>n[mid] && target<=n[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
}