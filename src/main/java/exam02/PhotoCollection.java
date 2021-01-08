package exam02;

import java.util.ArrayList;
import java.util.List;

public class PhotoCollection {
    List<Photo> photos = new ArrayList<>();

    public void addPhoto(String... photos) {
        for (String s : photos)
            this.photos.add(new Photo(s));
    }

    public void starPhoto(String name, Quality quality) {

        for (Photo x : photos) {
            if (x.getName() == name) {
                x.setQuality(quality);
                return;
            }
        }
        throw new PhotoNotFoundException("photo not found");
    }

    public int numberOfStars() {
        int count = 0;
        for (Photo x : photos) {
            count += x.getQuality().getValue();
        }
        return count;
    }

    public List<Photo> getPhotos() {
        return photos;
    }
}
