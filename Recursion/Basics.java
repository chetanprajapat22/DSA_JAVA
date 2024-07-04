package in.co.Recursion;

public class Basics {

    public static int power(int x,int n){
//        int xnm1 = root( x,n-1);
//        int xn =  x * xnm1;
//        return xn;
        return x*power(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));

    }
}
