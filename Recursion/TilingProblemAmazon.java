package in.co.Recursion;

public class TilingProblemAmazon {

    public static int tilingProblem(int n){ //2*1 (floor size)
        //base case
        if (n==0 || n==1){
            return 1;
        }
        //kaam
        //vertical choice
        int vertical = tilingProblem(n-1);

        //horizontal choice
        int horizontal = tilingProblem(n-2);

        int totWays = vertical+horizontal;
        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}
