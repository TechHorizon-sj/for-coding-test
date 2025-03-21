package twoPointer;

public class TwoPointer05 {
    public void solution(int N, int M, int[] arr) {
        int answer=0, sum=0, lt=0;

        for (int rt = 0; rt < N; rt++) {
            sum += arr[rt];
            if(sum==M) answer++;
            while (sum >= M) {
                // 이조건을 만족하면 밑의 과정을 하는 이유
                // 누적합이기 때문에 절대 작아질 수 없기 때문에 lt를 변경하는 것이다.
                sum -= arr[lt++];
                if(sum==M) answer++;
            }
        }

        System.out.println(answer);
    }
}
