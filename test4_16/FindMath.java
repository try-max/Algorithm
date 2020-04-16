/**
 * 找出出现一次的数字
 *
 * 作业内容
 * 有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
 * @author Q
 * @create 2020-04-15-16:10
 */
public class FindMath {
    public static int findMath(int[] arr,int length){
        int result=0;
        for (int i = 0; i <length; i++) {
            result^=arr[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr={1,2,3,1,3};
        for (int i = 0; i <arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }
        int result = findMath(arr, arr.length);
        System.out.println("result = " + result);
    }

}

