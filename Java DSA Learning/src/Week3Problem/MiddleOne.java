package Week3Problem;

public class MiddleOne {
    public static void main(String[] args) {
    int number  = middle(20,50,25);
        System.out.println(number);
    }
    static int middle(int A, int B, int C) {
        // code here
        if (A > B && A > C) {
            return B > C ? B : C;
        } else if (B > A && B > C) {
            return A > C ? A : C;
        } else {
            return A > B ? A : B;
        }
    }
}
