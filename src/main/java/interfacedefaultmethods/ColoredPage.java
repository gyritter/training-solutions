package interfacedefaultmethods;

public class ColoredPage {

    private String page;
    private String pageColor;

    public ColoredPage(String page, String pageColor) {
        this.page = page;
        this.pageColor = pageColor;
    }

    public ColoredPage(String page) {
        this.page = page;
        this.pageColor = Printable.BLACK;
    }

    public String getPage() {
        return page;
    }

    public String getPageColor() {
        return pageColor;
    }
}
