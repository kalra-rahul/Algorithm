package Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,3,5};
        int largestNum = Integer.MIN_VALUE;
        int smallestNum = Integer.MAX_VALUE;

        for(int num : arr){
            if(num > largestNum){
                largestNum = num;
            }

            if(num < smallestNum){
                smallestNum = num;
            }
        }

        System.out.print(largestNum);
        System.out.print(smallestNum);
    }
}
