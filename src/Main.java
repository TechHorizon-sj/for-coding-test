import twoPointer.TwoPointer02;

import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        TwoPointer02 tp = new TwoPointer02();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arrOneLen = Integer.parseInt(st.nextToken());
        int arrTwoLen = Integer.parseInt(st.nextToken());

        int[] arrOne = new int[arrOneLen];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrOneLen; i++) {
            arrOne[i] = Integer.parseInt(st.nextToken());
        }

        int[] arrTwo = new int[arrTwoLen];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrTwoLen; i++) {
            arrTwo[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(tp.solution(arrOne, arrTwo));
    }
}

