package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    public List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
    }

    public void deleteItemByRegistrationNumber(String regNumber) {
        for (CatalogItem item : catalogItems) {
            if (regNumber.equals(item.getRegistrationNumber())) {
                catalogItems.remove(item);
                return;
            }
        }
    }

    public int getAllPageNumber() {
        int result = 0;
        for (CatalogItem item : catalogItems) {
            if (item.hasPrintedFeature()) {
                result += item.numberOfPagesAtOneItem();
            }
        }
        return result;
    }

    public int getFullLength() {
        int result = 0;
        for (CatalogItem item : catalogItems) {
            if (item.hasAudioFeature()) {
                result += item.fullLengthAtOneItem();
            }
        }
        return result;
    }

    public double averagePageNumberOver(int limit) {
        if (limit < 1) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        double total = 0.0;
        double count = 0.0;
        for (CatalogItem item : catalogItems) {
            if (item.hasPrintedFeature()) {
                if (item.numberOfPagesAtOneItem() > limit) {
                    total += item.numberOfPagesAtOneItem();
                    count++;
                }
            }
        }
        if (total < 1) {
            throw new IllegalArgumentException("No page");
        }
        return total / count;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem item : catalogItems) {
            if (item.hasAudioFeature()) {
                result.add(item);
            }
        }
        return result;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem item : catalogItems) {
            if (item.hasPrintedFeature()) {
                result.add(item);
            }
        }
        return result;
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {

        String title = searchCriteria.getTitle();
        String contributor = searchCriteria.getContributor();
        List<Feature> features = new ArrayList<>();
        List<CatalogItem> result = new ArrayList<>();
        List<String> contributors = new ArrayList<>();

        if (Validators.isBlank(contributor)) {
            for (CatalogItem item : catalogItems) {
                features = item.getFeatures();
                for (Feature f : features) {
                    if (title.equals(f.getTitle())) {
                        result.add(item);
                    }
                }
            }
            return result;
        }

        if (Validators.isBlank(title)) {
            for (CatalogItem item : catalogItems) {
                features = item.getFeatures();
                for (Feature f : features) {
                    contributors = f.getContributors();
                    for (String s : contributors) {
                        if (contributor.equals(s)) {
                            result.add(item);
                        }
                    }
                }
            }
            return result;
        }

        for (CatalogItem item : catalogItems) {
            features = item.getFeatures();
            for (Feature f : features) {
                if (title.equals(f.getTitle())) {
                    contributors = f.getContributors();
                    for (String s : contributors) {
                        if (contributor.equals(s)) {
                            result.add(item);
                        }
                    }
                }
            }
        }
        return result;
    }
}
