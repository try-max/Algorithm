package test6_13;

/**
 * 不使用中间变量交换两个值,给定一个数组AB，交换数组0，1位上的数字
 * @author Q
 * @create 2020-06-13-15:15
 */


public class Exchange {
    public int[] exchangeAB(int[] AB) {
        // write code here
        AB[0]=AB[0]^AB[1];
        AB[1]=AB[0]^AB[1];
        AB[0]=AB[0]^AB[1];
        return AB;
    }
}
