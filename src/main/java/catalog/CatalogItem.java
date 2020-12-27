package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {

    private final String registrationNumber;
    private final int price;
    private List<Feature> features = new ArrayList<>();

    public CatalogItem(String registrationNumber, int price, Feature... feats) {
        this.registrationNumber = registrationNumber;
        this.price = price;
        for (Feature f:feats){
            features.add(f);
        }
    }

    public int fullLengthAtOneItem(){
        int length = 0;
        for(Feature feat:features){
            if(feat instanceof AudioFeatures){
                length += ((AudioFeatures) feat).getLength();
            }
        }
        return length;
    }

    public boolean hasAudioFeature(){
        for(Feature feat:features){
            if(feat instanceof AudioFeatures){
                return true;
            }
        }
        return false;
    }
    public List<String> getContributors(){
        List<String> result = new ArrayList<>();
        List<String> cont = new ArrayList<>();
        for(Feature feat:features){
            cont = feat.getContributors();
            for(String s:cont){
                result.add(s);
            }
        }
        return result;
    }

    public int numberOfPagesAtOneItem(){
        for(Feature feat:features){
            if(feat instanceof PrintedFeatures){
                return ((PrintedFeatures) feat).getNumberOfPages();
            }
        }
        return 0;
    }

    public List<String> getTitles(){
        List<String> result = new ArrayList<>();
        for(Feature feat:features){
            result.add(feat.getTitle());
        }
        return result;
    }

    public boolean hasPrintedFeature(){
        for(Feature feat:features){
            if(feat instanceof PrintedFeatures){
                return true;
            }
        }
        return false;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getPrice() {
        return price;
    }

    public List<Feature> getFeatures() {
        return features;
    }
}
