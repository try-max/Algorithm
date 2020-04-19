/**
 *
 * @author Q
 * @create 2020-04-15-19:49
 */
public class BinarySearch {

    public static int binarySearch(int[] array,int key){

        int left=0;
        int right=array.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (key<array[mid]){
                right=mid-1;
            }else if (key==array[mid]){
                return mid;
            }else{
                left=mid+1;
            }
        }

        return -1;
    }



    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int key=10;
//        int find=binarySearch(arr,key);
//        System.out.println(find);
        int find=binarySearch(arr,key);
        System.out.println(find);
    }
}
