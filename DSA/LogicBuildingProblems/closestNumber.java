package LogicBuildingProblems;

public class closestNumber {

     static int closest(int n, int m){
         int rem = n%m;
         if(rem == 0){
             return n;
         }
         int lower = n - rem;
         int upper = n + (m - rem);

         if (Math.abs(n - lower) <= Math.abs(n - upper)) {
             return lower;
         } else {
             return upper;
         }
     }
    public static void main(String[] args) {
        int n = 13;
        int m = 4;
        int res = closest(n,m);
        System.out.print(res);
    }

}
