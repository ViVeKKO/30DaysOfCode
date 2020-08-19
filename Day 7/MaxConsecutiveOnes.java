class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        // if()
        int maxc = 0;
        int maxg = 0;
        for(int i:nums){
            if(i == 1)
                ++maxc;
            else
            {
                maxg = Math.max(maxc,maxg);
                maxc = 0;
            }
        }
        maxg = Math.max(maxc,maxg);
        return maxg;
    }
}