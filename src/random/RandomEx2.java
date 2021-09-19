package random;

import java.util.regex.PatternSyntaxException;

public class RandomEx2 {
    final static int RECORD_NUM =10;
    final static String TABLE_NAME = "TEST_TABLE";
    final static String[] CODE1 = {"010","011","017","018","019"};
    final static String[] CODE2 = {"남자","여자"};
    final static String[] CODE3 = {"10대","20대","30대","40대","50대"};

    public static void main(String[] args) {
        for (int i =0;i<RECORD_NUM; i++) {
            System.out.println(" insert into "+ TABLE_NAME+" values (" +
                    "" + getRandArr(CODE1)+ " , " + getRandArr(CODE2) + " , " + getRandArr(CODE3) +
                    " , " + getRand(100,200) +
                    ");");
        }
    }

    private static String getRandArr(String[] arr) {
        return arr[getRand(arr.length-1)];
        //랜덤의 인덱스 얻어서 하나의 value 리턴
    }

    private static int getRand(int n) {
        return getRand(0,n);
    }

    private static int getRand(int from, int to) {
        return (int) ((Math.random()*(Math.abs(to-from)+1))+Math.min(from,to));
    }
}
