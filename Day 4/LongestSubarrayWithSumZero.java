import java.util.HashMap;

class LongestSubarrayWithSumZero {
    static int maxLen(int arr[]) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        int sum = 0;
        int le = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if(arr[i] == 0 && i == 0)
                le = 1;
            if(sum == 0){
                le = i+1;
            }
            Integer back = hm.get(sum);
            if(back != null){
                le =  Math.max(le, i - back);
            }
            else
                hm.put(sum, i);
        }      
        return le;

    }
}