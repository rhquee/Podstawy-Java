package point;


public class Point<T extends Number> {
    private T x;
    private T y;

    public String description() {
        return "X=" + x + " Y=" + y;
    }

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return super.toString()+ " " + description();
    }

    @Override
    public boolean equals(Object obj){
        Point p = (Point) obj;
        //zapis 1:
//        if(x.equals(p.getX()) &&  y.equals(p.getY())){
//            return true;
//        }else return false;

        //zapis 2:
        return x.equals(p.getX()) &&  y.equals(p.getY());
    }



    public void setX(T x) {
        this.x = x;
    }

    public T getX() {
        return x;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getY() {
        return y;
    }
}
