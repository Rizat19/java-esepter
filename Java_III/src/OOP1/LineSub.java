package OOP1;
//LineSub
//наследует начальную точку от своего суперкласса Point и добавляет конечную точку.

public class LineSub extends Point{
    Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end){
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    @Override
    public String toString() {
        return "LineSub{" +
                "end=" + end +
                '}';
    }

    public Point getBegin() {
        return new Point(getX(), getY());
    }

    public void setBegin(Point begin){
        begin = new Point(getX(), getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    //setters ....

    public int getLength(){
        return (int) Math.sqrt(Math.pow(getEndX()-getBeginX(), 2)+Math.pow(getEndY()-getBeginY(), 2));
    }




}
