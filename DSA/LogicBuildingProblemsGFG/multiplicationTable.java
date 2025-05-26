package LogicBuildingProblemsGFG;

public class multiplicationTable {
    static void table(int n){
        for (int i = 0; i <= 10; i++) {
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
    
    public static void main(String[] args) {
        int n = 5;
        table(n);
    }
}
