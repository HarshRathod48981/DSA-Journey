package StiverA2Z;

import static java.lang.Math.log10;

public class basicMath {
    public static void main(String[] args) {
        int n = 153;
    }

    //count digits of a number
    static void countDigits(int n){
        int count = (int)(log10(n)+1);
        System.out.println(count);
    }

    //reverse a number
    static int reverse(int n){
        int rev = 0;
        while (n>0){
            int rem = n%10;
            rev = (rev*10) + rem;
            n = n/10;

        }
        System.out.println(rev);
        return rev;
    }

    static void checkPalindromeNum(int n){
        if (n == reverse(n)) {
            System.out.println("palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }


    //GCD of a number
    static void GCD(int n1, int n2){
        int gcd = 1;
        for (int i = 1; i <Math.min(n1,n2) ; i++) {
            if (n1%i  == 0 && n2%i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }

    //armstrong number
    void armstrongNumber(int n){
        int power = toString(n).length();
    }
}
