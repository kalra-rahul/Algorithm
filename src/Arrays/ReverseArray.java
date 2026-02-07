package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {

    public static void ReverseArray(int[] arr) {
        int s =0;
        int e = arr.length-1;
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++; e--;
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void ReverseArrayList(List<Integer> arr) {
        int s = 0;
        int e = arr.size()-1;

        while( s < e){
            int temp = arr.get(s);
            arr.set(s, arr.get(e));
            arr.set(e, temp);
            s++; e--;
        }
        System.out.print(arr);
    }


    public static void main(String[] args){
        int[] arr = {1,2,4,5,6};
        Integer[] arr2 = {1,2,4,5,6};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr2));
        ReverseArray(arr);
        ReverseArrayList(arrayList);
    }
}
