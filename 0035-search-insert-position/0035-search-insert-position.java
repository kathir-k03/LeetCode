class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=-1,i;
        for( i=0;i<nums.length;i++){
                if(nums[i]==target){
                    s=i;
                }
            }
            if(i==nums.length&&s<0){
                for(int j=0;j<nums.length;j++){
                if(nums[j]>=target){
                s=j;
                break;
                }
            }
            if(target>nums[nums.length-1])
            s=nums.length;
            if(target<nums[0])
            s=0;
        }return s;
    }
}