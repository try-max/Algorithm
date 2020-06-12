package test6_12;
import java.util.ArrayList;
/**
 * 数组A，数组B[i]=A[0]A[1]*......A[i-1]+A[i+1]+.....A[n-1];
 * 求数组B
 * @author Q
 * @create 2020-06-12-17:01
 */
public class ArrayB {
    public static int[] multiply(int[] A) {
    int[] B=new int[A.length];
    for (int i = 0; i <B.length; i++) {
        B[i]=1;
    }
    for (int i = 0; i <A.length; i++) {
        for (int j = 0; j <A.length-1; j++) {
            if (i==0){
                B[i]*=A[j+1];
            }else{
                if (j+1==i){
                    continue;
                }
                B[i]*=A[j+1];
            }
        }

        
    }
    return B;

   }
   public static void display(int[] arr){
       for (int i = 0; i <arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
   }

    public static void main(String[] args) {
        int[] A=new int[]{1,2,3,4,5};
        int[] B=multiply(A);
        display(B);
    }
}

