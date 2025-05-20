package LogicBuildingProblems;

public class sumOfSquares {
    static int sumSquare(int n){
        int sum = 0;
        for (int i = 0; i <=n ; i++) {
            sum += i*i;
        }
        return sum;

    }
    public static void main(String[] args) {
        int n = 8;
        int res = sumSquare(n);
        System.out.println(res);
    }
}
