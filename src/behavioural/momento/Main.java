package behavioural.momento;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();
        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");
        history.push(editor.createState());
        editor.setContent("d");
        editor.restore(history.pop());//c
        editor.restore(history.pop());//b
        editor.restore(history.pop());//a
        System.out.println(editor.getContent());
    }
}
