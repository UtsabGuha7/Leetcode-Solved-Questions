class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> set= new HashSet<>();
    int longest=0;
    for(int num : nums){
        set.add(num);
    }
    for(int num:set){
        if(!set.contains(num-1)){
           int curr=num;
           int  cnt=1;
            while(set.contains(curr+1)){
                curr++;
                cnt++;
            }
            longest=Math.max(longest,cnt);
        }
    }
    return longest;
    }
}