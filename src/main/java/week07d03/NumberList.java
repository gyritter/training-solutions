package week07d03;

import java.util.List;

public class NumberList {

    public boolean isIncreasing(List<Integer> lista) {

        if (lista == null || lista.size()<2) {
            throw new IllegalArgumentException("The list is too short!");
        }

        for (int i=1; i<lista.size(); i++){
            if ((lista.get(i))<(lista.get(i-1))){
                return false;
            }
        }
        return true;
    }

}
