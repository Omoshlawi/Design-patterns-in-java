package behavioural.state.exercise;

public class RecyclingMode implements TravelMode{
    @Override
    public Object getDirection() {
        System.out.println("Calculating direction for driving");
        return 1;
    }

    @Override
    public Object getETA() {
        System.out.println("Calculating EAT for driving");
        return 1;
    }
}
