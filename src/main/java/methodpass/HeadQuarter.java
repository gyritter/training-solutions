package methodpass;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper){
        if(trooper == null){
            throw new IllegalArgumentException("The trooper must not be empty!");
        }
        troopers.add(trooper);
    }

    public void moveTrooperByName(String name, Position position){

        for (Trooper trooper: troopers) {
            if(name.equals(trooper.getName())){
                trooper.changePosition(position);
            }
        }
    }

    public void moveClosestTrooper(Position target) {
        double dist=30_000_000;
        int index = 0;
        double d2;
        for(int i=0; i<troopers.size(); i++){
            d2=troopers.get(i).distanceFrom(target);
            if (d2<dist){
                index = i;
                dist = d2;
            }
        }
        moveTrooperByName(troopers.get(index).getName(), target);
    }
}
