/**
 * 青蛙跳台阶算法，每次可以跳1级或两级，请问有n级台阶，有多少种算法，递归求解
 * 1 2 3 5 8
 * @author Q
 * @create 2020-04-13-19:33
 */
public class JumpFloor {
    public static int jumpFloor(int n){
        if (n==1){
            return 1;
        }else if (n==2){
            return 2;
        }else{
            return jumpFloor(n-1)+jumpFloor(n-2);
        }
    }

    public static void main(String[] args) {
        int sum=jumpFloor(5);
        System.out.println("sum = " + sum);
    }
}
