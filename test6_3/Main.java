package test6_3;


import java.util.Scanner;

/**
 * 用N构造斐波拉且数列，求数n最少需要多少步才能变成Fibonacci数列
 * @author Q
 * @create 2020-06-03-19:30
 */
public class Main {
    public static int fib(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int i = 0;
        for ( ; i <N; i++) {
            if (fib(i)>=N){
                break;
            }
        }
        int minCount=Math.abs(N-fib(i))>Math.abs(N-fib(i-1))?Math.abs(N-fib(i-1)):Math.abs(N-fib(i));
        System.out.println(minCount);
    }
}
