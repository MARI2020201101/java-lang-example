package exercise.exercise3;

import java.util.Objects;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        while(true){

            if(args.length <=1 ||Objects.isNull(args[0]) || Objects.isNull(args[1])){
                System.out.println("시작 단과 끝 단, 두개의 정수를 입력해주세요.");
                System.out.println("Usage : GugudanTest 3 5");
                System.exit(0);
            }
            String x = args[0];
            String y = args[1];
            int a = Integer.parseInt(x);
            int b = Integer.parseInt(y);
            if(a<=1 || a>9 || b<=1 || b>9 || a>b){
                System.out.println("단의 범위는 2와 9사이의 값이어야 합니다.");
                System.out.println("Usage : GugudanTest 3 5");
                System.exit(0);
            }
            else{
                for(int i=a;i<=b;i++){
                    for(int j=1;j<=9;j++){
                        System.out.printf("%d*%d=%d\n",i,j,i*j);
                    }
                    System.out.println();
                }
                break;
            }
        }
    }
}
