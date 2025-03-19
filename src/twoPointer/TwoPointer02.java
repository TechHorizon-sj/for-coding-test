package twoPointer;

public class TwoPointer02 {
    public void solution(int[] arrOne, int[] arrTwo) {
        StringBuilder sb = new StringBuilder();
        int p1 = 0, p2 = 0;

        while (p1 < arrOne.length && p2 < arrTwo.length) {
            if (arrOne[p1] < arrTwo[p2]) {
                sb.append(arrOne[p1++] + " ");
            } else {
                sb.append(arrTwo[p2++] + " ");
            }
        }

        while (p1 < arrOne.length) {
            sb.append(arrOne[p1++] + " ");
        }
        while (p2 < arrTwo.length) {
            sb.append(arrTwo[p2++] + " ");
        }

        System.out.println(sb);
    }
}
