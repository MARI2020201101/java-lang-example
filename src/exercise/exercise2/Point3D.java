package exercise.exercise2;

import java.util.Objects;

public class Point3D {

    public static void main(String[] args) {
        Point3D p1 = new Point3D(1,2,3);
        Point3D p2 = new Point3D(1,2,3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("p1==p2? "+ (p1==p2));
        System.out.println("p1.equals(p2)? " + p1.equals(p2));
    }

    int x,y,z;
    Point3D(int x,int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    Point3D(){
        this(0,0,0);
    }

    @Override
    public boolean equals(Object o) {
       if(o instanceof Point3D){
           Point3D tmp = (Point3D) o;
           return tmp.x==this.x && tmp.y==this.y && tmp.z==this.z;
       }return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
       return "[" + x + "," +y+","+z+"]";
    }
}