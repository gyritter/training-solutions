package week12d02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Street {

    private List<Site> sites = new ArrayList<>();

    public void sellSite(Site site) {
        sites.add(site);
    }

    public List<Site> getSites() {
        return sites;
    }

    public int LastNumber(){
       int oldal=sites.get(sites.size()-1).getSide();
       //lekértük az utolsólag eladott telek oldalát
        int count=0;
        for(Site x:sites){
            if (x.getSide()==oldal) count++;
        }
        return count*2-oldal;
    }

    public Result[] fenceStat(){
        Result[] results= new Result[Fence.values().length];
        for(int i=0; i<Fence.values().length;i++){
            results[i]=new Result(Fence.values()[i]);
        }
        for(Site x: sites){
            int index=x.getFence().ordinal();
            results[index].setNumber(results[index].getNumber()+1);
        }

        return results;
    }
}
