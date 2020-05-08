
import java.util.Scanner;
/**
 * 不借用任何字符串库函数实现无冗余地接受两个字符串，然后把它们无冗余的连接起来。
 */
public class Main{
    public static String fun(String str){
        String[] strings=str.split(" ");
        String temp="";
        for(String s:strings){
            temp+=s;
        }
        return temp;
} 
    
    
    
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //String str=scan.hasNext;
        while(scanner.hasNext()){
            String str=scanner.nextLine();
            String ret=fun(str);
            System.out.println(ret);
        }
        
    }
}