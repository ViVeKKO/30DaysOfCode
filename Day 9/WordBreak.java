import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.StringTokenizer;

public class WordBreak {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
         FastScanner fs=new FastScanner();
         int T=1;
         for(int i=0;i<5;i++){
             String a = fs.next();
             h.add(a);
         }
         for (int tt=0; tt<T; tt++) {
            String val = fs.next();
            solve(val,val.length(),"");
         }
}
 
private static void solve(String val, int length, String result) {
    for(int i=1;i<length;i++){
        String prefix = val.substring(0,i);
        if(h.contains(prefix)){
            if(i == length){
                result+=prefix;
                System.out.println(result);
                return;
            }
        }
        solve(val.substring(i,length-i), length-i, result+ prefix+ " ");
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
