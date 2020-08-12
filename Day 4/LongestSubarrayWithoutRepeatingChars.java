import java.util.HashSet;

class LSWRC {
    public int lengthOfLongestSubstring(String s) {
         HashSet<Character> h = new HashSet<>();
        int count = 0;
        int mcount = 0;
        int b = 0;
        for(int i=0;i<s.length();i++){
            
            if(!h.contains(s.charAt(i))){
                count++;
                h.add(s.charAt(i));
                mcount = Math.max(mcount,count);
            }
            else{
                i = b+1;
                b = i;
                mcount = Math.max(mcount,count);
                // count = 0;
                h.clear();
                h.add(s.charAt(i));
                count = 1;
            }
        }
        return mcount;
    }
}