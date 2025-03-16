import stack_queue.Programmers02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Programmers02 programmers02 = new Programmers02();

        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(programmers02.solution(progresses, speeds)));
    }
}
