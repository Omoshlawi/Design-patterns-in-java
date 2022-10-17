package behavioural.momento;

import java.util.Stack;

/**
 * This class is known as Caretaker((Abstract name used in the Gang of four book)
 */

public class History {
    private final Stack<EditorState> state;
    History() {
        state= new Stack<EditorState>();
    }

    public void push(EditorState state){
        this.state.push(state);
    }
    public EditorState pop(){
        return state.pop();
    }

}
