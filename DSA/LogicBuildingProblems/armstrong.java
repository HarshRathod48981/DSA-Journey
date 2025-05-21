package LogicBuildingProblems;

import java.util.Scanner;

public class armstrong {
    static void arm3digits(int n){
        int arm = 0,rem, temp = n;
        while(temp > 0){
            rem = temp%10;
            arm += rem*rem*rem;
            temp = temp/10;
        }
        if(n == arm){
            System.out.println("number " +n+ " is an armstrong number");
        }else {
            System.out.println("number " +n+ " is NOT an armstrong number");
        }
    }

    static void arm(int n){
        int arm = 0,rem, temp = n ,digits = 0;
        while(temp > 0){
            rem = temp%10;
            digits++;
            temp = temp/10;
        }
        rem = 0;
        temp = n;
        while(temp > 0){
            rem = temp%10;
            arm += Math.pow(rem, digits);
            temp = temp/10;
        }
        if(n == arm){
            System.out.println("number " +n+ " is an armstrong number");
        }else {
            System.out.println("number " +n+ " is NOT an armstrong number");
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number : ");
        n = sc.nextInt();
        arm(n);
    }
}
