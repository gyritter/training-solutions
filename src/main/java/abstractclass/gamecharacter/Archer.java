package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character {
    int numberOfArrows;

    public Archer(Point position) {
        super(position);
        this.numberOfArrows = 100;
    }

    public Archer(Point position, Random random) {
        super(position, random);
        this.numberOfArrows = 100;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    protected int getActualSecondaryDamage(){
        Random rnd = new Random();
        return rnd.nextInt(5)+1;
    }

    private void shootingAnArrow(Character enemy){
        numberOfArrows--;
        if (!(numberOfArrows<0)) super.hit(enemy, getActualSecondaryDamage());

    }

    public void secondaryAttack(Character enemy){
        shootingAnArrow(enemy);
    }

}
