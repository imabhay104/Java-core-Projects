public class Xpulse extends Bike{

    public Xpulse(String name, long id, double speed) {
        super(name, id, speed);
    }

    @Override
    public String Features() {
        return getName()+" is in white color";
    }
}
