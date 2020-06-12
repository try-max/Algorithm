package test5_20;

import java.util.Stack;

import static java.lang.Integer.*;

/**
 * 150. 逆波兰表达式求值
 * 根据逆波兰表示法，求表达式的值。
 *
 * 有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
 *
 * 说明：
 *
 * 整数除法只保留整数部分。
 * 给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。
 * @author Q
 * @create 2020-05-20-14:02
 */
public class EvalRPN {
    public static Stack<Integer> stack=new Stack<>();
    public static int evalRPN(String[] tokens) {
        for (int i = 0; i <tokens.length; i++) {
            if (tokens[i]=="+"||tokens[i]=="-"||tokens[i]=="*"||tokens[i]=="/"){
                int den=stack.pop();
                int mem=stack.pop();
                if (tokens[i].equals("+")){

                    stack.push(mem+den);

                }else if (tokens[i].equals("-")){

                    stack.push(mem-den);
                }else if (tokens[i].equals("*")){

                    stack.push(mem*den);
                }else{
                    stack.push(mem/den);
                }
//                switch (tokens[i]){
//                    case "+":stack.push(mem+den);
//                        break;
//                    case "-":stack.push(mem-den);
//                        break;
//                    case "*":stack.push(mem*den);
//                        break;
//                    case "/":stack.push(mem/den);
//                        break;
                }else {
                Integer result= parseInt(tokens[i]);
                stack.push(result);
            }
        }
        return stack.pop();

    }
    public static int evalRPN1(String[] tokens) {
        Stack<Integer> stack=new Stack<>();

        for (String s:tokens) {

            switch (s){
                case "+":
                    int den=stack.pop();
                    int mem=stack.pop();
                    stack.push(mem+den);
                    break;
                case "-":
                    den = stack.pop();
                    mem = stack.pop();
                    stack.push(mem-den);
                    break;
                case "*":
                    den = stack.pop();
                    mem = stack.pop();
                    stack.push(mem*den);
                    break;
                case "/":
                    den=stack.pop();
                    mem=stack.pop();
                    stack.push(mem/den);
                    break;
                default:stack.push(parseInt(s));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] strings=new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN1(strings));
    }
}
