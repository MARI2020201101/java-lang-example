package exercise.exercise1;

import java.util.Objects;

public class SutdaCard {

    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3,true);
        SutdaCard c2 = new SutdaCard(3,true);
        System.out.println("c1 = "+c1);
        System.out.println("c2 = "+c2);
        System.out.println(c1.equals(c2) + " " + c2.equals(c1));
    }
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1,true);
    }
    SutdaCard(int num, boolean isKwang){
        this.num=num;
        this.isKwang = isKwang;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof SutdaCard)) return false;
        SutdaCard tmp =(SutdaCard) obj;
        if(tmp.num==this.num && tmp.isKwang==this.isKwang){
            return true;
        }return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, isKwang);
    }

    @Override
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}
