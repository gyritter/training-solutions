package methodparam;

public class Measurement {

    private double results[];

    public Measurement(double[] results) {
        this.results = results;
    }

    public int findFirstIndexInLimit(int lower, int upper){
        int index=-1;
        for (int i=0; i<results.length; i++){
            if (results[i]> lower && results[i]<upper){
                index = i;
                return index;
            }
        }
        return index;
    }

    public double minimum(){
        double min=results[0];
        for (int i=1; i<results.length; i++){
            if (results[i]<min){
                min = results[i];
            }
        }
        return min;
    }

    public double maximum(){
        double max=results[0];
        for (int i=1; i<results.length; i++){
            if (results[i]>max){
                max = results[i];
            }
        }
        return max;
    }

    public ExtremValues minmax(){
        return new ExtremValues(minimum(), maximum());
    }
}

