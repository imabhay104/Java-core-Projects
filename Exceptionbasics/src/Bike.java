
public class Bike implements Vehicle{
    private long id;
    private String name;
    private double speed;

    public Bike(String name,long id, double speed) {
        this.name=name;
        this.id = id;
        this.speed = speed;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String move() {
        return getName()+"is moving with speed of "+getSpeed();
    }

    @Override
    public String Features() {
        return "";
    }
}
