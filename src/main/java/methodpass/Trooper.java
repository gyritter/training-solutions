package methodpass;

public class Trooper {

    private String name;
    private Position Position;

    public Trooper(String name) {
        if (name==null || name.length()<1){
            throw new IllegalArgumentException("Name must not be empty.");
        }
        this.name = name;
        this.Position = new Position(0,0);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return Position;
    }

    public void changePosition(Position target){
        if(target == null){
            throw new IllegalArgumentException("The position must not be null!");
        }
        this.Position = target;
    }

    public double distanceFrom(Position target){
        if(target == null){
            throw new IllegalArgumentException("The position must not be null!");
        }
        return Position.distanceFrom(target);
    }
}
