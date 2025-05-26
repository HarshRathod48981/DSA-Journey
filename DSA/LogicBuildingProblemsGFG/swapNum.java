package LogicBuildingProblemsGFG;

public class swapNum {
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A = " +a);
        System.out.println("B = " +b);


    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);

    }
}
