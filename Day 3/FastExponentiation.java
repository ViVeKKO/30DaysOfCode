import java.util.Scanner;

public class FastExponentiation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        fastpower(x,n);
        in.close();
    }

    private static void fastpower(int x, int n) {
        long res = 1; 
        while(n>0){
            if((n&1)==1)
                res = res * x;
            x = x * x;
            n = n>>1;
        }
        System.out.println(res);
    }
}
// if n is negative make it positive and return the result as 1/res