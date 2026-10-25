class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0, r=0, l=0, res=Integer.MAX_VALUE;
        for(r=0; r<nums.length; r++){
            sum+= nums[r];
            while(sum>=target){
                res= Math.min(res, r-l+1);
                sum-= nums[l++];
            }
        }
        if(res==Integer.MAX_VALUE)
            return 0;
        return res;
    }
}