# Exercise

Our Document class has three attributes:

- content
- fontName
- fontSize


We should allow the user to undo the changes to any of these attributes. In the future, we may add additional attributes
in this class and these attributes should also be undoable. Implement the undo feature using the memento pattern.

```java

//refactor the code to imperilment the momento pattern and should allow the undo feature
public class Document {
    private String content;
    private String fontName;
    private int fontSize;

    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}


```