public class TestMovablePoint {
    public static void main(String[] args) {

        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint.setSpeed(10, 20);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
