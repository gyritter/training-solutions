package interfaceextends;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot{

    public final static long ALTITUDE = 5;

    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();

    public AstroBoy(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public void walkTo(Point position){
        path.add(position);
        this.position = position;
    }

    public void flyTo(Point position){
        path.add(position);
        this.position = position;
    }

    @Override
    public void moveTo(Point position) {
        walkTo(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        Point flyPos = new Point(position.getX(), position.getY(), ALTITUDE);
        liftTo(ALTITUDE);
        flyTo(flyPos);
        liftTo(0);
    }

    @Override
    public void rotate(int angle) {
        this.angle = angle;
    }

    @Override
    public List<Point> getPath() {
        return path;
    }

    @Override
    public void liftTo(long altitude) {
        Point newPos = new Point(this.position.getX(), this.position.getY(), altitude);
        path.add(newPos);
        this.position = newPos;
    }

    public long getAltitude() {
        return position.getZ();
    }
}
