package behavioural.state;

public class ErasorTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Erasor Icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Erase Something");
    }
}
