package random;

import java.util.Arrays;

public class RandomEx {
    public static void main(String[] args) {
        for(int i =0; i<10; i++){
            System.out.println(getRand(5,10)+" ");
            System.out.println();
        int[] result = fillRand(new int[10], new int[]{2,3,7,5});
            System.out.println(Arrays.toString(result));
        }
    }
    private static int[] fillRand(int[] arr, int[] data){
        for(int i=0; i<arr.length ; i++){
            arr[i] = data[getRand(0,data.length-1)];
            //data배열 안의 인덱스 하나를 랜덤으로 얻어서 반환.
        }
        return arr;
    };

    private static int getRand(int from, int to) {
        return (int) ((Math.random()*(Math.abs(to-from)+1))+Math.min(from,to));
    }
}
