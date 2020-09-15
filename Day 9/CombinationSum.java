import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

public class CombinationSum {
     public static void main(String[] args) {
         FastScanner fs=new FastScanner();
         int T=1;
         for (int tt=0; tt<T; tt++) {
            int[] candidates= new int[]{2,3,6,7};
            int target = 7;
            List<List<Integer>> list = new ArrayList<>();
            solve(candidates,target,0,list,new ArrayList<Integer>());
            for(List<Integer> val:list)
            System.out.println(val);
         }
}
	private static void solve(int[] candidates, int target, int start, List<List<Integer>> list,ArrayList<Integer> temp) {
        if(target == 0){
            list.add(new ArrayList<>(temp));
            return;
        }
        else if(target < 0){
            return;
        }
        else{
            for(int i=start;i<candidates.length;i++){
                temp.add(candidates[i]);
                solve(candidates, target - candidates[i], start, list, temp);
                temp.remove(temp.size()-1);
            }
        }
	}


static class FastScanner {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer st=new StringTokenizer("");
     String next() {
     while (!st.hasMoreTokens())
         try {
             st=new StringTokenizer(br.readLine());
         } catch (IOException e) {
             e.printStackTrace();
         }
         return st.nextToken();
     }
     
     int nextInt() {
         return Integer.parseInt(next());
     }
     int[] readArray(int n) {
         int[] a=new int[n];
         for (int i=0; i<n; i++) a[i]=nextInt();
         return a;
     }
     long nextLong() {
         return Long.parseLong(next());
     }
 }

 
}
