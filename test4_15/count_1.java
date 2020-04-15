import java.util.Scanner;

/**
 * 二进制1的个数。
 *
 * 作业内容
 * 求一个整数，在内存当中存储时，二进制1的个数。
 * @author Q
 * @create 2020-04-13-16:55
 */
public class count_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int count=0;
        while(num!=0){
            if ((num&1)==1){
                count++;
            }
            num=num>>1;
        }
        System.out.println(count);
    }
}
