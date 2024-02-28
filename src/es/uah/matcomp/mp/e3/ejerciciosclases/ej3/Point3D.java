package es.uah.matcomp.mp.e3.ejerciciosclases.ej3;

public class Point3D extends Point2D{
    private float z;

    public Point3D(float x, float y, float z) {
        super(x,y);
        this.z = z;
    }

    public Point3D() {
        this.z = 0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }
    public float[] getXYZ() {
        float[] result = new float[3]; // construct an array of 3 elements
        result[0] = getX();
        result[1] = getY();
        result[2] = z;
        return result; // return the array
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";

    }
}
