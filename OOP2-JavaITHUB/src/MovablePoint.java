public class MovablePoint extends Point {

    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
        super();
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float [] getSpeed() {
        float [] xy = {xSpeed, ySpeed};
        return xy;
    }


    public MovablePoint move(){
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", Speed=(" + xSpeed + ", " + ySpeed + ")" +
                '}';
    }
}
