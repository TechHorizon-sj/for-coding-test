package twoPointer;

import java.util.Arrays;

public class TwoPointer07 {
    public void solution(int n, int[] arr, int x) {
        Arrays.sort(arr);
        int count = 0, p1 = 0, p2 = n - 1;

        while(p1 < p2) {
            if(x == arr[p1] + arr[p2]) {
                count++;
                p1++;
                p2--;
            } else if (x > arr[p1] + arr[p2]) {
                p1++;
            } else {
                p2--;
            }
        }

        System.out.println(count);
    }
}
