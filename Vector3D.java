public class Vector3D{

    double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public double getMagnitude() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public Vector3D normalize() {
        double magnitude = getMagnitude();
        if (magnitude == 0.0) {
            throw new IllegalStateException("Vector3D normalize() called with magnitude of 0");
        }
        x /= magnitude;
        y /= magnitude;
        z /= magnitude;
        return this;
    }
}
