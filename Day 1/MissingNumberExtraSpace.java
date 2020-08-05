class MissingNumberExtraSpace {
    public int missingNumber(int[] nums) {
        int gums[] = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            gums[nums[i]] = -1;
        }
        for(int i=0;i<gums.length;i++){
            if(gums[i]>=0){
                return i;
            }
        }
    return -1;
    }
}