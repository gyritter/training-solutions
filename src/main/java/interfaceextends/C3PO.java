package interfaceextends;

import java.util.ArrayList;
import java.util.List;

public class C3PO implements MoveableRobot{

    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();

    public C3PO(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    @Override
    public void moveTo(Point position) {
        newpos(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        newpos(position);
    }

    @Override
    public void rotate(int angle) {
        this.angle = angle;
    }

    private void newpos(Point position){
        this.position =position;
        path.add(position);
    }

    /*public Robot rotate(int angle){
        azimut += angle;
        azimut = azimut % 360;
        if(azimut<0) azimut += 360;
        return this;
    }*/

    @Override
    public List<Point> getPath() {
        return path;
    }
}
