class RainTrapping {
    public int trap(int[] height) {
        int n = height.length;
        if(n == 0)
            return 0;
        
        int left[] = new int[n];
        int right[] = new int[n];
        int index=-1;
        
        for(int i=0;i<n;i++){
            right[i] = 0;
            if(i<index){
                right[i] = height[index];
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(right[i] < height[j]){
                    right[i] = height[j];
                    index = j;
                }
            }
        }
        right[n-1] = 0;
        
        for(int i=1;i<n;i++){
            left[i] = 0;
            for(int j=i-1;j>=0;j--){
                if(left[i] < height[j]){
                    left[i] = height[j];
                }
            }
        }
        left[0] = 0;
        
        int sum = 0;
        
        for(int i=1;i<n;i++){
            if(right[i]>0 || left[i]>0){
                int val = Math.min(left[i],right[i]) - height[i];
                if(val>0){
                    sum = sum + val ;
                }
            }
        }
 
        return (sum);
        
    }
}