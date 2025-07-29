package StiverA2Z;

import java.util.Arrays;

import static java.lang.Math.log10;

public class basicMath {
    public static void main(String[] args) {
        int n = 2;
        isPrime(n);


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
    static void armstrongNumber(int n){
        int power = String.valueOf(n).length();
        int sum = 0;
        int num = n;
        while(n>0){
            int rem = n %10;
            sum += Math.pow(rem,power);
            n /= 10;
        }
        if (sum == num){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not an Armstrong number");
        }


    }
    static int[] printDivisors(int n) {
        int[] divisors = new int[n];

        for (int i = 1; i <=n ; i++) {
            if (n%1==0){
                divisors[i-1] = i;
            }
        }

        return divisors;
    }

    static void isPrime(int n){
        int count = 0;
        if (n <= 1) {
            System.out.println("Not prime");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}

