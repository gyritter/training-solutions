package abstractclass.gamecharacter;

public class BattleField {

    private int round;

    public int getRound() {
        return round;
    }

    private boolean oneHit(Character attacker, Character defender){
        if (attacker.isAlive() && defender.isAlive()){
        attacker.primaryAttack(defender);
        }
        if (attacker.isAlive() && defender.isAlive()) {
            attacker.secondaryAttack(defender);
        }
        if (attacker.isAlive() && defender.isAlive()) return true;
        return false;
    }

    public Character fight(Character one, Character other){

        while (one.isAlive() && other.isAlive()){
            oneHit(one, other);
            if (one.isAlive() && other.isAlive()){
                oneHit(other, one);
            }
            round++;
        }
        if(one.isAlive()) return one;
        return other;
    }
}
