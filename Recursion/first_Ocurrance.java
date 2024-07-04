package in.co.Recursion;

public class first_Ocurrance {

    public static  int firstOccurance(int arr[],int key,int i){
        if(i== arr.length){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr [] = {1,2,34,5,6,7,3,5,6};
        int key = 5;
        System.out.println(firstOccurance(arr,key,0));
    }
}
