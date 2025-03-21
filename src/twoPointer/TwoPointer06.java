package twoPointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoPointer06 {
    public void solution(int N, int S, int[] arr) {
        int p1=0, sum=0;
        int arrLen=0;

        List<Integer> list = new ArrayList<>();

        for (int p2 = 0; p2 < N; p2++) {
            arrLen+=1;
            sum += arr[p2];

            if(sum>=S) {
                list.add(arrLen); // 길이 기록
                sum -= arr[p1++];
                arrLen -= 1;
            }

            while (sum >= S) {
                list.add(arrLen);
                sum -= arr[p1++];
                arrLen -= 1;
            }
        }

        if (list.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(Collections.min(list));
        }
    }
}
