package exercise.exercise3;

public class Exercise13 {
    public static void main(String[] args) {
        String src = "aabbccAABBCCaa";
        System.out.println(src);
        System.out.println("aa를 "+ stringCount2(src, "aa") +" 개 찾았습니다.");
    }

    private static int stringCount(String src, String key){
        return stringCount(src,key,0);
    }
    private static int stringCount(String src, String key ,int pos) {
        int count =0;
        int index =0;
        if(key==null || key.length()==0){
            return 0;
        }
        while(true){
            index=src.indexOf(key);
            if(index!=-1){
                count++;
                src=src.substring(index+key.length());
            }else break;
        }
        return count;
    }
    private static int stringCount2(String src, String key){
        return stringCount(src,key,0);
    }
    static int stringCount2(String src, String key ,int pos){
        int count =0;
        int index =0;
        if(key==null || key.length()==0){
            return 0;
        }
        while((index=src.indexOf(key,pos))!=-1){
            count++;
            pos+=index+key.length();
        }
        return count;
    }
}
