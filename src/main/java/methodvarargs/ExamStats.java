package methodvarargs;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitPercent, int... results) {

        if(results == null || results.length<1){
            throw new IllegalArgumentException("Number of results must not be empty!");
        }

        int count = 0;
        for (int result : results) {
            if (100 * result / maxPoints > limitPercent){
                count++;
            }
        }
        return count;
    }

    public boolean hasAnyFailed(int limitPercent, int... results){

        if(results == null || results.length<1){
            throw new IllegalArgumentException("Number of results must not be empty!");
        }

        for (int result : results) {
            if (100 * result / maxPoints < limitPercent){
             return true;
            }
        }
        return false;
    }
}

/*

Tipp
Ha a felsorolást nem adja meg a felhasználó (kihagyja a paramétert), a metódusnál
nem mutat hibát az IDE. Vararg esetén ugyanis ilyenkor automatikusan üres tömb lesz
a paraméter. Ebben az esetben viszont IllegalArgumentException-t várunk, a megfelelő
tájékoztató szöveggel.
 */