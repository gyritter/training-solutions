package abstractclass.gamecharacter;

import java.util.Random;

public class AxeWarrior extends Character{

    public AxeWarrior(Point position, Random random) {
        super(position, random);
    }

    private int getActualSecondaryDamage(){
        Random rnd=new Random();
        return super.getActualPrimaryDamage()*(rnd.nextInt(2)+1);
    }

    public void secondaryAttack(Character enemy){
        if(this.getPosition().distance(enemy.getPosition())<2){
            super.hit(enemy, getActualSecondaryDamage());
        }
    }
}
