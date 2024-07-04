package in.co.Recursion;

public class last_Occurance {

    public static int lastOccurance(int arr[],int key,int i){
        if (i== arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if (isFound != -1){
            return isFound;
        }
        //check
        if (arr[i]==key){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {8,6,43,23,56,6,7,8};
        System.out.println(lastOccurance(arr,8,0));

    }
}
