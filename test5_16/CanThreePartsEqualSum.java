package test5_16;

/**
 * 1013. 将数组分成和相等的三个部分
 * 给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
 *
 * 形式上，如果可以找出索引 i+1 < j 且满足
 * (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1]
 * == A[j] + A[j-1] + ... + A[A.length - 1])
 * 就可以将数组三等分。
 * @author Q
 * @create 2020-05-16-21:12
 */
public class CanThreePartsEqualSum {
    //1.i+1<j
    //2.三段相等
    public static boolean canThreePartsEqualSum(int[] A) {
        int sum=0;
        for (int i:A) {
            sum+=i;
        }
        if (sum%3!=0){
            return false;
        }
        int temp=A[0];
        int t2=0;
        for (int i = 1; i <A.length; i++) {
            if (sum/3==temp){
                t2+=A[i];
                if (t2 == sum/3 && i != A.length - 1){
                    return true;
                }
            }else {
                temp+=A[i];
            }


        }
//        if (2==flag){
//            return true;
//        }
        return false;
    }
    public static boolean canThreePartsEqualSum1(int[] A) {
        int sum = 0;
        for (int i : A) {
            sum += i;
        }
        if (sum % 3 != 0) {
            return false;
        }

        int temp = A[0];
        int t2 = 0;
//        int current = 0;
        for (int i = 0; i < A.length; i++) {
            if (temp == sum/3) {
                t2 +=A[i];
                if (t2 == sum/3 && i != A.length - 1) {
                    return true;
                }
            } else {
                temp += A[i];

            }
//            if (sum/3==temp){
//                temp=0;
//                if ()
//            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] array=new int[]{0,2,1,-6,6,-7,9,1,2,0,1};
        System.out.println(canThreePartsEqualSum(array));
    }

}
