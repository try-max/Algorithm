package test6_11;

import java.util.Scanner;

/**
 * 计算N!(1<=N<=1000)，后有多少个0?
 * @author Q
 * @create 2020-06-11-10:34
 */
public class Count0 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            if (n<1||n>1000){
                return;
            }
            int count=0;
            for (int i = 1; i <=n; i++) {
                n/=5;
                count+=n;
            }
            System.out.println(count);

        }


    }
}
