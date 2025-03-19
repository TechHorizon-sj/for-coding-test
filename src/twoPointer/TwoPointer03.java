package twoPointer;

import java.util.Arrays;

public class TwoPointer03 {
    public void solution(int[] arrOne, int[] arrTwo) {
        StringBuilder sb = new StringBuilder();

        int p1 = 0, p2 =0;

        Arrays.sort(arrOne);
        Arrays.sort(arrTwo);

        while(p1 < arrOne.length && p2 < arrTwo.length) {
            if (arrOne[p1] == arrTwo[p2]) {
                sb.append(arrOne[p1++] + " ");
                p2++;
            } else if (arrOne[p1] < arrTwo[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        System.out.println(sb);
    }
}
