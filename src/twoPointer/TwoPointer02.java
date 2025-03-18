package twoPointer;

import java.util.ArrayList;
import java.util.List;

public class TwoPointer02 {
    public String solution(int[] arrOne, int[] arrTwo) {
        int p1 = 0, p2 = 0;

        List<Integer> list = new ArrayList<>();

        while (p1 < arrOne.length && p2 < arrTwo.length) {
            if (arrOne[p1] < arrTwo[p2]) {
                list.add(arrOne[p1++]);
            } else {
                list.add(arrTwo[p2++]);
            }
        }

        while (p1 < arrOne.length) {
            list.add(arrOne[p1++]);
        }
        while (p2 < arrTwo.length) {
            list.add(arrTwo[p2++]);
        }

        String str = list.toString().replaceAll("[^0-9 ]","");

        return str;
    }
}
