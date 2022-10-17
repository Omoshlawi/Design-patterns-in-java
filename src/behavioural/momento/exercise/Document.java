package behavioural.momento.exercise;

public class Document {
    private String content, fontName;
    private int  size;

    public void setContent(String content) {
        this.content = content;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DocumentMomento createState(){
        return new DocumentMomento(content, fontName, size);
    }
    public void undo(DocumentMomento state){
        content = state.getContent();
        fontName = state.getFontName();
        size = state.getSize();
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", size=" + size +
                '}';
    }
}
