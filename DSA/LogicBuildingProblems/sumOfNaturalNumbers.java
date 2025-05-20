package LogicBuildingProblems;

public class sumOfNaturalNumbers {

    static void sum(int n){
        int sum = 0;
        for (int i = 0; i <=n ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int n = 5;
        sum(n);
    }
}
