import twoPointer.TwoPointer01;

import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        TwoPointer01 tp = new TwoPointer01();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arrOneLen = Integer.parseInt(st.nextToken());
        int[] arrOne = new int[arrOneLen];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrOneLen; i++) {
            arrOne[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int arrTwoLen = Integer.parseInt(st.nextToken());
        int[] arrTwo = new int[arrTwoLen];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrTwoLen; i++) {
            arrTwo[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Arrays.toString(tp.solution(arrOne, arrTwo)));
    }
}

// 3
// 1 3 5
// 5
// 2 3 6 7 9
