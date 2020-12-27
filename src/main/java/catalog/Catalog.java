package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private List<CatalogItem> catalogItems= new ArrayList<>();

    public void addItem(CatalogItem catalogItem){
        catalogItems.add(catalogItem);
    }

    public void deleteItemByRegistrationNumber(String regNumber){
        for(CatalogItem item:catalogItems){
            if(regNumber.equals(item.getRegistrationNumber())){
                catalogItems.remove(item);
                return;
            }
        }
    }

    public int getAllPageNumber(){
        int result = 0;
        for(CatalogItem item:catalogItems){
            if(item.getFeatures() instanceof PrintedFeatures){
                result += item.numberOfPagesAtOneItem();
            }
        }
        return result;
    }

    public int getFullLength(){
        int result = 0;
        for(CatalogItem item:catalogItems){
            if(item.getFeatures() instanceof AudioFeatures){
                result += item.fullLengthAtOneItem();
            }
        }
        return result;
    }

    public double averagePageNumberOver(int limit){
        double total=0.0;
        double count =0.0;
        for(CatalogItem item:catalogItems){
            if(item.getFeatures() instanceof PrintedFeatures){
                if (item.numberOfPagesAtOneItem()> limit){
                    total+=item.numberOfPagesAtOneItem();
                    count++;
                }
            }
        }
        return total/count;
    }

    public List<CatalogItem>getAudioLibraryItems(){
        List<CatalogItem> result = new ArrayList<>();
        for(CatalogItem item:catalogItems){
            if(item.getFeatures() instanceof AudioFeatures){
                result.add(item);
            }
        }
        return result;
    }

    public List<CatalogItem> getPrintedLibraryItems(){
        List<CatalogItem> result = new ArrayList<>();
        for(CatalogItem item:catalogItems){
            if(item.getFeatures() instanceof PrintedFeatures){
                result.add(item);
            }
        }
        return result;
    }
}
