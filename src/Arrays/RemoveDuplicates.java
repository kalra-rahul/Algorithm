package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class RemoveDuplicates {
    public static void removeDuplicate(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = {1,1,2,3,4,5};

        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        Set<Integer> set = map.keySet();

        for(int val : set){
            System.out.println(val);
        }
    }


    public static void main(String[] args) {
    /*
        *
       ***
      *****
     *******

     n = 4
      n-i   2n-1 n-1
     space  *  Space
     3      1
     2      3
     1      5
     0      7
     */
        int n = 4;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
