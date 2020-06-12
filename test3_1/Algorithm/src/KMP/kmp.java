package KMP;


import java.util.Arrays;

public class kmp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str1="BBC ABCDAB ABCDABCDABDE";
        String str2="ABCDABD";
//		String str2="BBC";
//		int[] next=kmpNext("ABCDABD");

        int index=kmpSearch(str1,str2);
        System.out.println("index="+index);
    }
    //写出kmp搜索算法
    /**
     *
     * @param str1 源字符串
     * @param str2 子串
     * @param next 部分匹配值
     * @return
     */
    public static int kmpSearch(String str1,String str2) {
        int[] next=kmpNext(str2);
        System.out.println("next="+Arrays.toString(next));
        //遍历
        for(int i=0,j=0;i<str1.length();i++) {
            //需要处理str1.charAt(i)!=str2.charAt(j),去调整j的大小
            //KMP算法核心点
            while(j>0&&str1.charAt(i)!=str2.charAt(j)) {
                j=next[j-1];
            }
            if(str1.charAt(i)==str2.charAt(j)) {
                j++;
            }
            if(j==str2.length()) {
                return i-j+1;
            }
        }
        return -1;
    }

    //获取到一个字符串（字串）的部分匹配值
    public static   int[] kmpNext(String dest) {
        //创建一个next数组，保存部分匹配值
        int[] next=new int[dest.length()];
        next[0]=0;//如果字符串是长度为1部分匹配就是0
        for(int i=1,j=0;i<dest.length();i++) {

            while(j>0&&dest.charAt(i)!=dest.charAt(j)) {
                j=next[j-1];
            }
            if(dest.charAt(i)==dest.charAt(j)) {
                j++;
            }
            next[i]=j;
        }
        return next;
    }


}
