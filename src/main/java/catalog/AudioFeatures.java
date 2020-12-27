package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AudioFeatures implements Feature{

    private final List<String> composer;
    private final int length;
    private final List<String> performers;
    private final String title;

    public AudioFeatures(String title, int length,  List<String> performers, List<String> composer) {
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException();
        }
        if (Validators.isEmpty(performers)){
            throw new IllegalArgumentException();
        }
        if (length<0){
            throw new IllegalArgumentException();
        }
        this.title = title;
        this.length = length;
        this.performers = performers;
        this.composer = composer;
    }

    public AudioFeatures(String title, int length,  List<String> performers) {
        if(Validators.isBlank(title)){
            throw new IllegalArgumentException();
        }
        if (Validators.isEmpty(performers)){
            throw new IllegalArgumentException();
        }
        if (length<0){
            throw new IllegalArgumentException();
        }
        this.title = title;
        this.length = length;
        this.performers = performers;
        this.composer = Arrays.asList();
    }

    @Override
    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        contributors.addAll(composer);
        contributors.addAll(performers);
        return contributors;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    public int getLength() {
        return this.length;
    }
}
