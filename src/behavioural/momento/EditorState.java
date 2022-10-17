package behavioural.momento;

/**
 * This class is known as Momento((Abstract name used in the Gang of four book)
 */

public class EditorState {
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
