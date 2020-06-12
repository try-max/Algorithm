package test6_4;

/**
 * 对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。
 * 给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串
 *
 * 例子："(()())" ,6
 *    return true
 * @author Q
 * @create 2020-06-04-23:12
 */
public class Parenthesis {
    public static boolean chkParenthesis(String str,int n){
        if (n%2!=0){
            return false;
        }
        char[] chars=str.toCharArray();
        int num1=0,num2=0,num3=0;
        for (int i = 0; i <chars.length ; i++) {
            if ('('==chars[i]){
                num1++;
            }
            if ('['==chars[i]){
                num2++;
            }
            if ('{'==chars[i]){
                num3++;
            }
            if (')'==chars[i]){
                num1--;
            }
            if (']'==chars[i]){
                num2--;
            }
            if ('}'==chars[i]){
                num3--;
            }
        }
        if (num1==0&&num2==0&&num3==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str="(()())";
        int n=6;
        System.out.println(chkParenthesis(str, 6));
    }
}
