package behavioural.momento.exercise;

import java.util.Stack;

public class History {
    private final Stack<DocumentMomento> states;

    public History() {
        this.states = new Stack<>();
    }

    public void push(DocumentMomento state){
        states.push(state);
    }
    public DocumentMomento pop(){
        return states.pop();
    }
}
