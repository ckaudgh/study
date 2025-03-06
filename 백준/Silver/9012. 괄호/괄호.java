import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        for(int i = 0; i < num; i++) {
            System.out.println(solution(in.next()));
        }
    }
    public static String solution(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);
            // 여는 괄호일 경우 스택에 넣는다.
            if (c == '(') {
                stack.push(c);
            }
            // 스택이 비어있는 경우. 닫는 괄호를 입력받았으나 pop할 원소가 없을 경우
            else if (stack.empty()) {
                return "NO";
            }
            // 닫는 괄호일 경우 stack 원소를 pop 
            else {
                stack.pop();
            }
        }
        if (stack.empty()) {
            return "YES";
        }
        else {
            return "NO";
        }
    }

}