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
            throw new IllegalStateException("Can't call normalize() with magnitude of 0");
        }
        x /= magnitude;
        y /= magnitude;
        z /= magnitude;
        return this;
    }

    public Vector3D add(Vector3D v) {
        return new Vector3D(x + v.getX(), y + v.getY(), z + v.getZ());
    }

    public Vector3D multiply(double scalar) {
        return new Vector3D(x * scalar, y * scalar, z * scalar);
    }

    public double dotProduct(Vector3D v) {
        return x * v.getX() + y * v.getY() + z * v.getZ();
    }

    public double angleBetween(Vector3D v) {
        if (getMagnitude() == 0.0 || v.getMagnitude() == 0.0) {
            throw new IllegalStateException("Can't call angleBetween() with magnitude of 0");
        }
        return Math.acos(dotProduct(v) / (getMagnitude() * v.getMagnitude()));
    }

    public Vector3D crossProduct(Vector3D v) {
        return new Vector3D(y * v.getZ() - z * v.getY(), z * v.getX() - x * v.getZ(), x * v.getY() - y * v.getX());
    }

}
