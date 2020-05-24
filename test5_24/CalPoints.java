package test5_20;

import java.util.Stack;

import static java.lang.Integer.parseInt;

/**
 * 682. 棒球比赛
 * 你现在是棒球比赛记录员。
 * 给定一个字符串列表，每个字符串可以是以下四种类型之一：
 * 1.整数（一轮的得分）：直接表示您在本轮中获得的积分数。
 * 2. "+"（一轮的得分）：表示本轮获得的得分是前两轮有效 回合得分的总和。
 * 3. "D"（一轮的得分）：表示本轮获得的得分是前一轮有效 回合得分的两倍。
 * 4. "C"（一个操作，这不是一个回合的分数）：表示您获得的最后一个有效 回合的分数是无效的，应该被移除。
 *
 * 每一轮的操作都是永久性的，可能会对前一轮和后一轮产生影响。
 * 你需要返回你在所有回合中得分的总和。
 * @author Q
 * @create 2020-05-20-16:58
 */
public class CalPoints {
    public static int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<>();

        for (String s:ops) {
            switch (s){
                case "+":
                    int den=stack.pop();
                    int mem=stack.pop();
                    stack.push(mem);
                    stack.push(den);
                    stack.push(den+mem);
                    break;
                case "D":
                    den = stack.peek();
                    stack.push(den*2);
                    break;
                case "C":
                    stack.pop();

                    break;
                default:
                    stack.push(parseInt(s));


            }
        }
        int result=0;
        for (int i:stack) {
            result+=i;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] pos=new String[]{"5","2","C","D","+"};
        System.out.println(calPoints(pos));
    }

}
