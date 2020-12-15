package interfacedefaultmethods;

import java.util.ArrayList;
import java.util.List;

public class StoryBook implements Printable{

    private List<ColoredPage> pages = new ArrayList<>();

    @Override
    public int getLength() {
        return this.pages.size();
    }

    @Override
    public String getPage(int pageNumber) {
        return pages.get(pageNumber).getPage();
    }

    @Override
    public String getColor(int pageNumber) {
        return pages.get(pageNumber).getPageColor();
    }

    public void addPage(String page, String color){
        pages.add(new ColoredPage(page, color));
    }
}
