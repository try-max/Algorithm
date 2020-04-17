/**
 * 奇数位于偶数之前
 *
 * 作业内容
 * 调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序
 * @author Q
 * @create 2020-04-16-9:02
 */
public class SortOddEven {
    public static void sortOddEven(int[] array){
        int left=0;
        int right=array.length-1;
        while (left<right){
            while (array[left]%2==0&&left<right){
                left++;
            }
            while (array[right]%2!=0&&left<right){
                right--;
            }
            if (left<right) {
                int temp=array[left];
                array[left]=array[right];
                array[right]=temp;
            }
        }
    }
    public static void print(int[] array){
        for (int i = 0; i <array.length; i++) {
            System.out.print("array["+i+"] = " + array[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr={2,3,1,6,7};
        print(arr);
        sortOddEven(arr);
        print(arr);
    }
}
