import twoPointer.TwoPointer07;

import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        TwoPointer07 tp = new TwoPointer07();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());

        tp.solution(n, arr, x);
    }
}

