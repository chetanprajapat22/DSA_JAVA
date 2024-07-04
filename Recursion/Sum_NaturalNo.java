package in.co.Recursion;

public class Sum_NaturalNo {

    public static int SumN(int n){
        if (n==1){
            return 1;
        }
        int snm1 = SumN(n-1);
        int Sn = n+snm1;
        return Sn;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(SumN(n));
    }
}
