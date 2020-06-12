package KMP;

/**
 * 暴力匹配算法
 * @author Q
 * @create 2020-03-10-9:09
 */
public class ViolenceMatch {
    public static void main(String[] args) {
        String string1="abababababcdddd";
        String string2="abc";
        int index=violenceMatch(string1,string2);
        System.out.println(index);

    }
    //暴力匹配算法
//    public static void violenceMatch(String str1,String str2){
//        char[] s1=str1.toCharArray();
//        char[] s2=str2.toCharArray();
        //方式一：
//        for (int i = 0; i <s1.length; i++) {
//            int flag=i,count=0;
//            for (int j=0;j<str2.length();j++){
//                if (s1[flag]==s2[j]){
//                    flag++;
//                    count++;
//                }else {
//                    System.out.println("第" + (i + 1) + "次匹配失败");
//                    continue;
//                }
//                if (count==str2.length()){
//                    System.out.println("在"+(i+1)+"的位置有字串字串");
//                }
//            }
//
//        }
        //方式二：
    public static int violenceMatch(String str1,String str2){
        char[] s1=str1.toCharArray();
        char[] s2=str2.toCharArray();
        int s1Len=str1.length();
        int s2Len=str2.length();
        int i=0;
        int j=0;
        while (i<s1Len&&j<s2Len){
            if (s1[i]==s2[j]){
                i++;
                j++;
            }else {
                i=i-(j-1);
                j=0;
            }
        }
        if (j==s2Len){
            return i-j;
        }else {
            return -1;
        }
    }
}
