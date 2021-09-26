package exercise.exercise3;

public class Exercise5 {

    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB","AB"));
        System.out.println(count("12345","AB"));
    }

    static int count(String src, String target){
        int count =0;
        int pos=0;

        while(pos<=src.length()){
            pos=src.indexOf(target,pos);
            if(pos<0){
                break;
            }
            else{
                count++;
                pos+=target.length();
            }
        }
        return  count;
    }
}
