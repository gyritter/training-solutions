package isahasa;

public class Bold extends TextDecorator{

    public Bold(TextSource textSource) {
        super((textSource));
    }

    @Override
    public String getPlainText() {
        return "<b>" + getTextSource().getPlainText() + "</b>";
    }
}
