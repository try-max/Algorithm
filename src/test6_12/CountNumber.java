package test6_12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 计算一个数，计算数出现了多少次；
 * 例如：100311
 * 输出：0：2
 *      1：3
 *      3：1
 * @author Q
 * @create 2020-06-12-16:43
 */
public class CountNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String string=in.nextLine();
            char[] chars=string.toCharArray();
            HashMap<Character,Integer> map=new HashMap<>();
            for (int i = 0; i <chars.length; i++) {
                if (map.containsKey(chars[i])){
                    map.put(chars[i],map.get(chars[i])+1);
                }else {
                    map.put(chars[i],1);
                }
            }
            Arrays.sort(chars);
            for (int i = 0; i <chars.length ; i++) {
                if (map.containsKey(chars[i])){
                    System.out.println(chars[i]+":"+map.get(chars[i]));
                    map.remove(chars[i]);
                }
            }
//            for (int i = 0; i <map.size(); i++) {
//                System.out.println(map.+":"+);
//            }
        }
    }
}
