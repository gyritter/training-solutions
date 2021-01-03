package isahasa;

public class Underlined extends TextDecorator{

    public Underlined(TextSource textSource) {
        super((textSource));
    }

    @Override
    public String getPlainText() {
        return "<u>" + getTextSource().getPlainText() + "</u>";
    }
}
