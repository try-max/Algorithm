package test6_18;



import java.util.HashMap;
import java.util.Scanner;

/**给一串数字，单个数字分别表示0 ，1，2，3，4.。。。。9的个数
 * 1000000001   ：1个0 ，1个9
 * 将已知数，排列组成最小的数（0不能当首位）
 *  最小数为 90
 * @author Q
 * @create 2020-06-18-15:16
 */
public class findMinMath {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            StringBuffer sb=new StringBuffer();
            HashMap<Integer,Integer> map=new HashMap<>();
            for (int i = 0; i <10; i++) {
                int num=in.nextInt();
                map.put(i,num);
            }

            for (int i = 1; i <10; i++) {
                if (map.get(i)>0){
                    sb.append(i);
                    map.put(i,map.get(i)-1);
                    break;
                }
            }
            for (int i = 0; i <10; i++) {
                while (map.get(i)>0){
                    sb.append(i);
                    map.put(i,map.get(i)-1);
                }
            }

            System.out.println(sb);
        }


    }
}
