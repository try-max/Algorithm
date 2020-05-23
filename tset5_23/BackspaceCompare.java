package test5_20;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Stack;

/**
 * 844. 比较含退格的字符串
 * 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，
 * 判断二者是否相等，并返回结果。 # 代表退格字符。
 *
 * 注意：如果对空文本输入退格字符，文本继续为空。
 * @author Q
 * @create 2020-05-20-17:49
 */
public class BackspaceCompare {
    public static boolean backspaceCompare(String S, String T) {
        if (S==null&&T==null){
            return true;
        }
        if ((S==null&&T!=null)||(S!=null&&T==null)){
            return false;
        }
        Stack<Character> sStack=new Stack<>();
        Stack<Character> tStack=new Stack<>();
        char[] s=S.toCharArray();
        char[] t=T.toCharArray();
        for (char chars:s) {
            if ('#'==chars&&!sStack.isEmpty()){
                sStack.pop();
            }else if('#'!=chars){
                sStack.push(chars);
            }


        }
        for (char chars:t) {
            if ('#'==chars&&!tStack.isEmpty()){
                tStack.pop();
            }else if('#'!=chars){
                tStack.push(chars);
            }


        }
        System.out.println("sStack:"+sStack.toString());
        System.out.println("tStack:"+tStack.toString());
        while (!tStack.isEmpty()&&!sStack.isEmpty()){
            int stemp=sStack.pop();
            int ttemp=tStack.pop();
            if (stemp!=ttemp){
                return false;
            }
        }
        if (tStack.isEmpty()&&sStack.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s="y#f#o##f";
        String t="y#fo##f";
        System.out.println(backspaceCompare(s, t));
    }
}
