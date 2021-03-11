public class Point3D extends Point2D {

    private float z;

    public Point3D() {
        super();
        z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float [] getXYZ() {
        float [] xyz = {super.getX(), super.getY(), z};
        return xyz;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "(" + super.getX() + ", " + super.getY() + ", " + z + ")";
    }
}