import java.util.Scanner;

public class GCDLogn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = gcd(a,b);
        System.out.println(ans);
        in.close();
    }

    private static int gcd(int a, int b) {
        if(b==0)
            return a;
        else
            return gcd(b,(a%b));
        // return 0;
    }
}