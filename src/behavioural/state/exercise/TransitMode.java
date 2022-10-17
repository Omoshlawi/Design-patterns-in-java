package behavioural.state.exercise;

public class TransitMode implements TravelMode{
    @Override
    public Object getDirection() {
        System.out.println("Calculating direction for transit mode");
        return 1;
    }

    @Override
    public Object getETA() {
        System.out.println("Calculating EAT for transit mode");
        return 1;
    }
}
