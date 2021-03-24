package people;

import behaviours.ISecurity;
import behaviours.ITicketed;

public class Visitor implements ISecurity, ITicketed {

    private int age;
    private double height;
    private double money;

    public Visitor(int age, double height, double money) {
        this.setAge(age);
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public boolean isAllowed() {
        if (this.age <= 15) {
            return true;
        } else if (this.age <= 18) {
        }
        System.out.println("Not allowed on playground Playground)");
        return false;
    }

    public double defaultPrice() {
        return defaultPrice();
    }

    public double priceFor() {
        return priceFor();
    }

    public void setAge(int age) {
        this.age = age;
    }
}
