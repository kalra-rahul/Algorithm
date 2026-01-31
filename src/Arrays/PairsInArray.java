package Arrays;

public class PairsInArray {
    public static void printPairArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                System.out.print("("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
    }

    public static void printSubArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length ; j++) {
                for (int k = i; k <=j ; k++) {
                     System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void printSubArrUsingTwoLoop(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
           StringBuilder subStr = new StringBuilder(String.valueOf(arr[i]));
           System.out.println(subStr.toString());

            for (int j = i+1; j < arr.length ; j++) {
                subStr.append(",").append(String.valueOf(arr[j]));
                System.out.println(subStr.toString());
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {2,4,6,8};
        printSubArrUsingTwoLoop(arr);
    }
}
