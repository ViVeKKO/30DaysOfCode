class SortColorsCountingSort{
    public void sortColors(int[] nums) {
        int freq[] = new int[3];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                freq[0]++;
            else if(nums[i] == 1)
                freq[1]++;
            else
                freq[2]++;
        }
        int j=0;
        for(int i=0;i<3;i++)
            while(freq[i]!=0){
                nums[j] = i;  
                j++;
                --freq[i];
            }
    }
}