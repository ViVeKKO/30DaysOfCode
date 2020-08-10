import java.util.HashSet;

class SolutionLCS {
    public int longestConsecutive(int[] nums) {
    HashSet<Integer> h = new HashSet<>();
    for(int i:nums){
        h.add(i);
    }
        
        int max = 0;
    for(int i=0;i<nums.length;i++){
        int count = 1;
        int num = nums[i];
        while(h.contains(--num)){
            // num = num - 1;
            count++;
             h.remove(num);
        }
        num = nums[i];
        while(h.contains(++num)){
            count++;
            h.remove(num);
        }
        max = Math.max(max,count);
    }
        return max;
    }
}