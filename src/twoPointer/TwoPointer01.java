package twoPointer;

import java.util.ArrayList;
import java.util.List;

public class TwoPointer01 {
    public int[] solution(int[] arrOne, int[] arrTwo) {
        int p1 = 0;
        int p2 = 0;

        List<Integer> answer = new ArrayList<>();

        while(p1 < arrOne.length && p2 < arrTwo.length) {
            if(arrOne[p1] < arrTwo[p2]) {
                answer.add(arrOne[p1++]);
            } else {
                answer.add(arrTwo[p2++]);
            }
        }

        while (p1 < arrOne.length) {
            answer.add(arrOne[p1++]);
        }
        while (p2 < arrTwo.length) {
            answer.add(arrTwo[p2++]);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
