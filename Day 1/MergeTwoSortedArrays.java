import java.util.Scanner;
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int a[] = new int[m];
        for(int i=0;i<m;i++){
            a[i] = in.nextInt();
        int b[] = new int[n];
        for(int j=0;j<n;j++){
            b[i] = in.nextInt();
        }
        mergethem(a,b,m,n);
        in.close();
        }

    }

    private static void mergethem(int[] arr1, int[] arr2, int m, int n) {
        for (int i=n-1; i>=0; i--) 
        { 
            int j, last = arr1[m-1]; 
            for (j=m-2; j >= 0 && arr1[j] > arr2[i]; j--) 
                arr1[j+1] = arr1[j]; 
       
            // If there was a greater element 
            if (j != m-2 || last > arr2[i]) 
            { 
                arr1[j+1] = arr2[i]; 
                arr2[i] = last; 
            } 
        } 

    }
    
}

// 2 4 6 7 32 33
// 3 4 5 6 7 8

