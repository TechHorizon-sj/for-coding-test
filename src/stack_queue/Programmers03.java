package stack_queue;

import java.util.Stack;

public class Programmers03 {
    public boolean solution(String s) {
        boolean answer = false;
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                count++;
            }
            if(s.charAt(i) == ')') {
                count--;
            }
            if(count < 0 ) break;
        }

        if(count == 0) {
            answer = true;
        }

        return answer;
    }
}
