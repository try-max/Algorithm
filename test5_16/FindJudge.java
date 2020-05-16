package test5_16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 997. 找到小镇的法官
 * 在一个小镇里，按从 1 到 N 标记了 N 个人。传言称，这些人中有一个是小镇上的秘密法官。
 *
 * 如果小镇的法官真的存在，那么：
 *
 * 小镇的法官不相信任何人。
 * 每个人（除了小镇法官外）都信任小镇的法官。
 * 只有一个人同时满足属性 1 和属性 2 。
 * 给定数组 trust，该数组由信任对 trust[i] = [a, b] 组成，表示标记为 a 的人信任标记为 b 的人。
 *
 * 如果小镇存在秘密法官并且可以确定他的身份，请返回该法官的标记。否则，返回 -1。
 * @author Q
 * @create 2020-05-16-18:56
 */
public class FindJudge {

    public static int findJudge(int N, int[][] trust) {
        int[] trust1 = new int[N];
        int[] trusted = new int[N];
//        initArray(first);
        for (int i = 0; i <= trust.length - 1; i++) {

            trust1[trust[i][1] - 1]++;
            trusted[trust[i][0] - 1] = 1;
        }
        for (int i = 0; i < N; i++) {
            if (trust1[i] == N - 1 && trusted[i] != 1) {
//                for (int j = 0; j <trust.length; j++) {
//                    if (trust[i][0]==i+1){
//                        System.out.println("error");
//                        return -1;
//                    }
//                }
//                display(first);
                return i + 1;
            }
        }


        return -1;
    }
//    public static void initArray(int[] array){
//        for (int i = 0; i <array.length; i++) {
//            array[i]=0;
//        }
//
//    }
//    public static void display(int[] array){
//        for (int i = 0; i <array.length; i++) {
//            System.out.print(array[i]+" ");
//        }
//        System.out.println();
//    }


    public static void main(String[] args) {
        int[][] trust = new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
        System.out.println(findJudge(4, trust));
    }
}

