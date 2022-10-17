# Exercise

In the bellow provided code is a
DirectionService class. This is the class that powers our mapping
app. It provides two methods for calculating the estimated time of
arrival (ETA) and the direction between two points.
Identify the problems in this implementation. Then, refactor the code
to use the state pattern. What are the benefits of the new
implementation

```java

//file name DirectionService.java
public class DirectionService {
    private TravelMode travelMode;

    public Object getEta() {
        if (travelMode == TravelMode.DRIVING) {
            System.out.println("Calculating ETA (driving)");
            return 1;
        }
        else if (travelMode == TravelMode.BICYCLING) {
            System.out.println("Calculating ETA (bicycling)");
            return 2;
        }
        else if (travelMode == TravelMode.TRANSIT) {
            System.out.println("Calculating ETA (transit)");
            return 3;
        }
        else {
            System.out.println("Calculating ETA (walking)");
            return 4;
        }
    }

    public Object getDirection() {
        if (travelMode == TravelMode.DRIVING) {
            System.out.println("Calculating Direction (driving)");
            return 1;
        }
        else if (travelMode == TravelMode.BICYCLING) {
            System.out.println("Calculating Direction (bicycling)");
            return 2;
        }
        else if (travelMode == TravelMode.TRANSIT) {
            System.out.println("Calculating Direction (transit)");
            return 3;
        }
        else {
            System.out.println("Calculating Direction (walking)");
            return 4;
        }
    }

    public TravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }
}


//file name TravelMode.java

public enum TravelMode {
    DRIVING,
    BICYCLING,
    TRANSIT,
    WALKING
}


```

# Solutions

### problems identified
- Bulk code due to too many if statements to check travel mode, this is both in both redirection and getEAT
- Its ver hard to extend ie adding a new travel modes such as flying, or any other mode could lead to enormous
change since you have to go to every block of code where traveling mode is compared and add the new modes
- Hard to maintain since you have to mak changes at every point where the modes are referenced
Check the code for reimplement solution using the state pattern


# NB: in state patten the state is a data member/attribute of a context class, in other words a state is like an attribute of a class
With state pattern we create a class for all the modes which implements a traveling mode abstract/bas/interface for traveling mode with contractual methods for the traveling mode
