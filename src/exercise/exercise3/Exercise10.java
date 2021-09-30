package exercise.exercise3;

public class Exercise10 {

    public static void main(String[] args) {
        String str ="가나다";
        System.out.println(format(str,7,0));
        System.out.println(format(str,7,1));
        System.out.println(format(str,7,2));
    }
    static String format(String str, int length, int alignment){
        if(str.length()>length){
            return str.substring(length);
        }
        char[] tmp = new char[length];
        for(int i=0; i<tmp.length; i++){
            tmp[i]=' ';
        }
        char[] original = new char[str.length()];
        for(int i=0; i<original.length; i++){
            original[i]=str.charAt(i);
        }
        switch (alignment){
            case 0:System.arraycopy(original,0,tmp,0,str.length());break;
            case 1:System.arraycopy(original,0,tmp,(tmp.length-str.length())/2,str.length());break;
            case 2:System.arraycopy(original,0,tmp,tmp.length-str.length(),str.length());break;
        }
        return new String(tmp);
    }
}
