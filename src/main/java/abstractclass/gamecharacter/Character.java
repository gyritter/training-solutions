package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private Point position;
    private int hitPoint = 100;
    private Random random = new Random();
    private static final int MAX_DAMAGE = 10;
    private static final int MAX_DEFENCE = 5;

    public Character(Point position) {
        this.position = position;
    }

    public Character(Point position, Random random) {
        this.position = position;
        this.random = random;
    }

    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public boolean isAlive() {
        if (hitPoint > 0) return true;
        return false;
    }

    protected int getActualPrimaryDamage(){
        return random.nextInt(10)+1;
    }

    protected int getActualDefence(){
        return random.nextInt(6);
    }

    protected void hit(Character enemy, int damage){
        if(getActualDefence()<damage) enemy.decreaseHitPoint(damage);
    }

    public void primaryAttack(Character enemy){
        hit(enemy, getActualPrimaryDamage());
    }

    private void decreaseHitPoint(int diff){
        hitPoint = hitPoint-diff;
    }

     public abstract void secondaryAttack(Character enemy);
}
