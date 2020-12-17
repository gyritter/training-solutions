package interfaceextends;

public class Point {

    final long x;
    final long y;
    final long z;

    public Point(long x, long y, long z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public long getX() { return x; }

    public long getY() {
        return y;
    }

    public long getZ() {
        return z;
    }

}
