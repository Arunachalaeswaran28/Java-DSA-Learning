package Week3Problem;

public class GCD {
    public static void main(String[] args) {
        int gcd = gcd(60,36);
        System.out.println(gcd);
    }
    public static int gcd(int a, int b) {
        // code here
        if(a ==0) return b;
        if(b== 0) return a;
        while(a!=b)
        {
            if(a>b)
                a = a-b;
            if(b>a)
                b = b-a;

        }
        return a;
    }
}
