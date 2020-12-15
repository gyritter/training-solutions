package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

   private List<Integer> lottery =new ArrayList<>();
   Random rnd= new Random(5);

    public List getNumbers(int interval, int numbers){
        lottery.add(draw(interval));
        int rndNumber;
        boolean exists;
        while (lottery.size()<numbers){
            rndNumber=(draw(interval));
            exists=false;
            for(int rnd:lottery){
                if (rndNumber == rnd){
                   exists=true;
                }
            }
            if (!(exists)) lottery.add(rndNumber);
        }
        return lottery;
    }
    public int draw(int interval) {
        return rnd.nextInt(interval)+1;
    }
    public String toString(){
        StringBuilder numbers=new StringBuilder();
        for (int rnd:lottery){
            numbers.append(rnd);
            numbers.append(" ");

        }
        return numbers.toString().trim();
    }
}
