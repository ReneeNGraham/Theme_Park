package attractions;


import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {
   Visitor visitor;
    public Playground(String name, int rating) {
        super(name, rating);

    }
    public boolean isAllowed() {
        if (visitor.getAge() >= 15) {
            return false;
        } else {
            return true;
        }
        }
    }


