package exercise.exercise3;

import jdk.swing.interop.SwingInterOpUtils;

public class Exercise12 {
    static int getRand(int from, int to){
        int tmp=0;
        tmp=Math.min(from,to);
        if(tmp!=from){
            to=from;
            from=tmp;
        }
        int answer = 0;

        if(from<0 && to<0){
            answer = (-1)*((int)(Math.random()*(Math.abs(from)-Math.abs(to)+1)) + Math.abs(to));
        }else if(from<0){
            int[] answers = new int[2];
            answers[0]= (-1)*(int) (Math.random()*(Math.abs(from)+1));
            answers[1] = (int) (Math.random()*(to))+1;
            int tmp2 = (int) (Math.random() * 1);
            answer = answers[tmp2];
        }
        else{
            answer= (int)(Math.random()*(to-from+1))+from;
        }
        return answer;
    }

    public static void main(String[] args) {
        for(int i =0;i<20;i++){
            System.out.print(getRand2(3,-5) +",");
        }
    }

    static int getRand2(int from, int to){
        return (int)(Math.random()*(Math.abs(to-from)+1))+Math.min(from,to);
    }
}
