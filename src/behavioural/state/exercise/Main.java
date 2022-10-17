package behavioural.state.exercise;

public class Main {
    public static void main(String[] args) {
        var dir = new DirectionService(new DrivingMode());
        dir.getDirection();
        dir.getEat();
        dir.setTravelMode(new TransitMode());
        dir.getDirection();
        dir.getEat();

    }
}
