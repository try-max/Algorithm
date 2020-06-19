package test6_18;

import java.util.Scanner;

/**
   输入： 1
 * 输出： 1^3=1
 输入： 2
 * 输出：2^3=3+5
 输入： 3
 * 输出：3^3=7+9+11
 输入： 4
 * 输出：4^3=13+15+17+19
 输入：5
 * 输出：5^3=21+23+25+27+29
 *
 *
 * @author Q
 * @create 2020-06-18-15:52
 */
public class GetSequeOddNum {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            StringBuffer sb=new StringBuffer();
            int a=n*n-n+1;
            System.out.print(a);
            for (int i = 1; i <n ; i++) {
                System.out.print("+"+(a+=2));
            }
            System.out.println();
        }

    }
}
