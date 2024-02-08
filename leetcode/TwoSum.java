public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int size=2;
        int[] result=new int[size];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return new int[]{-1,1};
    }
}