package behavioural.momento.exercise;

public class Main {
    public static void main(String[] args) {
        var document = new Document();
        var hist = new History();
        document.setContent("Hellow there");
        document.setFontName("Hellow there");
        document.setSize(20);
        hist.push(document.createState());
        System.out.println(document);

        document.setContent("Hellow 2");
        document.setFontName("Hellow 2 there");
        document.setSize(50);
        System.out.println(document);

        document.undo(hist.pop());
        System.out.println(document);
    }
}
