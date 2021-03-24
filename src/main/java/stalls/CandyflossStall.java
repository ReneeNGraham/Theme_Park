package stalls;

import behaviours.IReviewed;

public class CandyflossStall extends Stall implements IReviewed {

  private int rating;

    public CandyflossStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
        this.rating = rating;

    }

    public int getRating() {
        return this.rating;
    }
}
