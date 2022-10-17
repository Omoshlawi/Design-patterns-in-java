package behavioural.state.exercise;

public class DirectionService {
    private TravelMode travelMode;

    DirectionService(TravelMode travelMode){
        this.travelMode = travelMode;
    }


    public TravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }

    public Object getDirection(){
        return travelMode.getDirection();
    }

    public Object getEat(){
        return travelMode.getETA();
    }
}
