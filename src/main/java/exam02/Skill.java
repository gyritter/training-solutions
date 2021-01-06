package exam02;

public class Skill {
    private String name;
    private int level;

    public Skill(String name, int level) {
        if (level<1 || level>5){
            throw new IllegalArgumentException("level must be between 1 and 5");
        }
        if (name==null || name==""){
            throw new IllegalArgumentException("name must not be null");
        }
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }
}
