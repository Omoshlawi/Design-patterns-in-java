package behavioural.momento;

import java.util.Stack;

/**
 * This class is known as Originator(Abstract name used in the Gang of four book)
 * It has dependency relationship with Momento/EditorState because it's passed in the restore as a dependency
 */

public class Editor {
    private String content;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {

        this.content = content;
    }

    public EditorState createState(){
        return new EditorState(content);
    }

    public void restore(EditorState state){
        content = state.getContent();
    }

}
