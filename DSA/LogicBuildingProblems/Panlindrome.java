package LogicBuildingProblems;

public class Panlindrome {

    static void palindrome1(int n) {
        int r,c=n, s = 0;
        while(n > 0) {
            r = n%10;
            s = s*10 + r;
            n = n/10;
        }
        if(c==s){
            System.out.println("number " +c+ " is a palindrome");
        }else {
            System.out.println("number " +c+ " is NOT a palindrome");
        }
    }

    static void palindrome2(int n){
        int reversed = 0, temp = n, reminder;
        while(n > 0) {
            reminder = n%10;
            reversed = reversed*10 + reminder;
            n = n/10;
        }
        if(reversed==temp){
            System.out.println("number " +temp+ " is a palindrome");
        }else {
            System.out.println("number " +temp+ " is NOT a palindrome");
        }
    }

    static void palindrome3(String str){
        String temp = str;
        String rev ="";
        for (int i = str.length()-1 ; i >= 0 ; i--) {
            rev = rev+str.charAt(i);
        }
        if(str.equalsIgnoreCase(rev)){
            System.out.println("String " +str+ " is a palindrome");
        }else {
            System.out.println("String " +str+ " is NOT a palindrome");
        }
    }

    public static void main(String[] args) {
        int n = 545;
        String str = "racecar";
        //palindrome1(n);
        //palindrome2(n);
        palindrome3(str);
    }
}
