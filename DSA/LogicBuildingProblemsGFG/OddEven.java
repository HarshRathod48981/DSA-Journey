package LogicBuildingProblemsGFG;

//Given a positive integer n, determine whether it is odd or even. Return true if the number is even and false if the number is odd.

public class OddEven {

    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int n = 100;
        isEven(n);
    }
}
