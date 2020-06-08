package testnewexampleexercise;

public class Main {
    public static void main(String[] args) {

        Object[] points = new Point[4];
        points[0] = new Point(2, 8);
        points[1] = new Point(4, 6);
        points[2] = new Point(4, 7);
        points[3] = new Point(9, 5);

        for (int i = 0; i < points.length; i++){
            System.out.println(points[i]);
        }

    }
}

class Point extends Object{

    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (this.getClass() != obj.getClass()){
            return false;
        }
        Point przslany = (Point)obj;
        return this.x == przslany.x && this.y == przslany.y;
    }

    public String toString() {

        return getX() + " " + getY();
    }

}


