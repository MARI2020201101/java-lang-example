package exercise.exercise3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise9 {

    public static void main(String[] args) {
        System.out.println(delChar("(1~2@3^4~5)", "~!@#$%^&*()"));
        System.out.println(delChar("(12  3   4\t5)", "\t"));
    }

    public static String delChar(String src, String delCh) {
        char[] delChars = delCh.toCharArray();
        int[] check = new int[src.length()];
        for(int i =0; i<check.length;i++){
            check[i]=0;
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0;i< delChars.length;i++){
            for(int j=0;j<src.length();j++){
                if(src.charAt(j)==delChars[i]){
                    check[j]=1;
                }
            }
        }
        for(int i=0;i<src.length();i++){
            if(check[i]==0){
                sb.append(src.charAt(i));
            }
        }
        return sb.toString();
    }
}