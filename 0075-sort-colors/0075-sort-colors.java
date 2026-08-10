class Solution {
    public void sortColors(int[] nums) {
    int cnt0=0,cnt1=0,cnt2=0;
        int n= nums.length;
      for(int i=0;i<n;i++){
        if(nums[i]==0){
            cnt0++;
        }else if(nums[i]==1){
            cnt1++;
        }else{
           cnt2++;
        }
      }
      int index=0;
      for(int j=0;j<cnt0;j++){
        nums[index++]=0;
      }
      for(int j=0;j<cnt1;j++){
        nums[index++]=1;
      }
      for(int j=0;j<cnt2;j++){
        nums[index++]=2;
      }
    }
}