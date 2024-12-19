public class Himalayan extends Bike{
    public Himalayan(String name, long id, double speed) {
        super(name, id, speed);
    }
    @Override
    public String Features() {
        return getName()+" is in black color";
    }
}
