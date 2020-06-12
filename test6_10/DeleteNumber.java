package test6_10;


import java.util.LinkedList;

import java.util.Scanner;

/**
 *  链接：https://www.nowcoder.com/questionTerminal/f9533a71aada4f35867008be22be5b6e
 * 来源：牛客网
 *
 * 有一个数组a[N]顺序存放0~N-1，要求每隔两个数删掉一个数，到末尾时循环至开头继续进行，求最后一个被删掉的数的原始下标位置。
 * 以8个数(N=7)为例:｛0，1，2，3，4，5，6，7｝，0->1->2(删除)->3->4->5(删除)->6->7->0(删除),如此循环直到最后一个数被删除。
 * @author Q
 * @create 2020-06-10-9:38
 */

public class DeleteNumber {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            if (n>1000){
                n=1000;
            }
            LinkedList<Integer> list=new LinkedList<>();
            for (int i = 0; i <n; i++) {
                list.add(i);
            }

            int pos=0;

            while (list.size()>1){
                pos+=2;
                pos=pos%list.size();
                list.remove(pos);
            }
            System.out.println(list.get(0));
        }



    }
}
