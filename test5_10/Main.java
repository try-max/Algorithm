package test5_10;

import java.util.Scanner;

/**
 *
 * 每组数据输入一个字符串，字符串最大长度为100，且只包含字母，不可能为空串，区分大小写。
 *
 *
 * 输出描述:
 * 每组数据一行，按字符串原有的字符顺序，输出字符集合，即重复出现并靠后的字母不输出。
 * 示例1
 * 输入
 * abcqweracb
 * 输出
 * abcqwer
 * @author Q
 * @create 2020-05-10-17:08
 */
public class Main {

    public static String fun(char[] chars){
        char[] desc=new char[27];
        int pos=0;
        boolean isTrue=false;

        for (int i = 0; i <chars.length; i++) {
            isTrue=false;
            for (int j = 0; j <27; j++) {
                if (desc[j]==chars[i]){
                    isTrue=true;
                    continue;
                }
            }
            if (false==isTrue){
                desc[pos]=chars[i];
                pos++;
            }
        }
        String result="";
        for (int i = 0; i <27; i++) {
            result+=desc[i];
        }
        return result;
    }
    public static void fun2(String str){
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i <str.length(); i++) {
            char ch=str.charAt(i);
            String temp=sb.toString();
            if (!temp.contains(ch+"")){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String string=scanner.nextLine();
            char[] chars=string.toCharArray();
//            System.out.println(fun(chars));
            fun2(string);
        }
    }
}
