import java.util.Scanner;

public class KadaneAlgorithms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        int maxc  = arr[0];
        int maxg = arr[0];
        for(int i=0;i<n;i++){
            maxc = Math.max(maxc+arr[i],arr[i]);
            maxg = Math.max(maxc,maxg);
        }
        System.out.println(maxg);
        in.close();
    }
}