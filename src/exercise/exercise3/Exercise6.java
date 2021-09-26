package exercise.exercise3;

import java.util.Arrays;
import java.util.StringJoiner;

public class Exercise6 {

    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src,10));
        System.out.println(fillZero(src,-1));
        System.out.println(fillZero(src,3));
    }
    public static String fillZero(String src, int length){
        if(src==null || src.length()==length) return src;
        else if(length<=0) return "";
        else if(src.length()>length)return src.substring(0,length);
        else {
            char[] answer = new char[length];
            for(int i=0; i<length ; i++){
                answer[i]='0';
            }
            char[] tmp = src.toCharArray();
            for(int i = 0;i<tmp.length ; i++){
                answer[length-i-1]=tmp[tmp.length-i-1];
            }
            return String.valueOf(answer);
        }

    }
}
