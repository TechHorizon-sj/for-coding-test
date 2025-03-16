package stack_queue;

import java.util.*;

public class Programmers02 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for(int i = 0; i < speeds.length; i++) {
            double remain = (double) (100 - progresses[i]) / speeds[i];
            int date = (int) Math.ceil(remain);

            if (!queue.isEmpty() && queue.peek() < date) {
                answerList.add(queue.size());
                queue.clear();
            }

            queue.add(date);
        }

        answerList.add(queue.size());

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
