package world.ferrina;

public class Bird extends Animal implements Trackable,FlightEnabled
{
    @Override
    public void move() {
        System.out.println("Birds flying");
    }

    @Override
    public void flights() {

    }

    @Override
    public void canttrack() {

    }
//    @Override
//    public void move() {System.out.println("Moving from Bird class\n");
//    }

}