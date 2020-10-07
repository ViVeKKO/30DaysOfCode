import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

public class CombinationsSum2 {
     public static void main(String[] args) {
         FastScanner fs=new FastScanner();
         int T=1;
         for (int tt=0; tt<T; tt++) {
            int []Combinations = new int[5];
            int target = 7;      
            Arrays.sort(Combinations);
            List<List<Integer>> list = new ArrayList<>();
            goSolveThis(Combinations,target,list,new ArrayList<>(),0);
         }
}
 
 private static void goSolveThis(int[] combinations, int target, List<List<Integer>> list, List<Integer > temp, int start) {
     if(target == 0){
         list.add(new ArrayList<>(temp));
         return;
     }
     else if(target<0){
         return;
     }
    else{
        for(int i=start;i<combinations.length;i++){
            if(i>start && combinations[i] == combinations[i-1]){
                continue;
            }
            temp.add(combinations[i]);
            goSolveThis(combinations, target, list, temp, start+i);
            temp.remove(temp.size() - 1);
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
