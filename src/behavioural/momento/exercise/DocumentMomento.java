package behavioural.momento.exercise;

public class DocumentMomento {
    private String content, fontName;
    private int  size;

    public DocumentMomento(String content, String fontName, int size) {
        this.content = content;
        this.fontName = fontName;
        this.size = size;
    }

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public int getSize() {
        return size;
    }
}
