package behavioural.state.exercise;

public class DrivingMode implements TravelMode{
    @Override
    public Object getDirection() {
        System.out.println("Calculating direction for driving mode");
        return 1;
    }

    @Override
    public Object getETA() {
        System.out.println("calculating EAT for driving mode");
        return 1;
    }
}
