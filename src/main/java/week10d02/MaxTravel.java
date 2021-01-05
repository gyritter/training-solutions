package week10d02;

import java.util.List;

public class MaxTravel {

    int[] busStop = new int[30];

    public int getMaxIndex(List<Integer> passangers){
        for(int x:passangers){
            busStop[x]++;
        }
        int maxPassanger=0;
        int bStop=0;
        for(int i=0; i<30; i++){
            if (busStop[i]>maxPassanger){
                maxPassanger=busStop[i];
                bStop=i;
            }
        }
        return bStop;
    }


}
