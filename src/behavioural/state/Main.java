package behavioural.state;

public class Main {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseUp();
        canvas.mouseDown();
        //adding new tool(extensiblity) is easier. you simply create a class that implement tool and
        //pass it as you passed the selection tool object e.g adding erasor tool
        canvas.setCurrentTool(new ErasorTool());
        canvas.mouseUp();
        canvas.mouseDown();
    }
}
