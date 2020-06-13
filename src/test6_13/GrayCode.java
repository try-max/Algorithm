package test6_13;
/**
 * 格雷数列
 * @author Q
 * @create 2020-06-13-15:23
 */



public class GrayCode {
    public String[] getGray(int n) {
        if(n==1){
            return new String[]{"0","1"};
        }
        String[] s1=getGray(n-1);//递归调用
        String[] s2=new String[2*s1.length];
        for(int i=0;i<s1.length;i++){
            s2[i]="0"+s1[i];//首位添加0
            s2[i+s1.length]="1"+s1[s1.length-1-i];//首位添加1，注意需要顺序反向
        }
        return s2;
    }
}
//class GrayCode {
//    public: vector getGray(int n) {
//        // write code here vector gray;
//        if(n == 1){ gray.push_back("0");
//        gray.push_back("1");
//        return gray;
//        }
//        vector last_gray = getGray(n-1);
//        for(int i = 0; i < last_gray.size(); i++)
//            gray.push_back("0"+last_gray[i]);
//        for(int i = last_gray.size()-1; i >= 0; i--)
//            gray.push_back("1"+last_gray[i]);
//        return gray;
//    }
//};