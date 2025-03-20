package twoPointer;

import java.util.Arrays;

/** 슬라이딩 윈도우 */
public class TwoPointer04 {
    public void solution(int N, int K, int[] arr) {
        int currSum = 0;
        int maxSum;

        for (int i = 0; i < K; i++) {
            currSum += arr[i];
        }

        maxSum = currSum;

        for (int i = K; i < N; i++) {
            currSum = currSum - arr[i - K] + arr[i];
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println(maxSum);
    }
}
