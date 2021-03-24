package stalls;


import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    Visitor visitor;

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
        this.visitor = null;
    }

    public boolean isAllowed() {
        if (visitor.getAge() >= 18) {
            return true;
        } else {
            return false;
        }
    }
}


