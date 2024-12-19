public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        System.out.println(car.getModel());
        car.setModel("JLR");
        car.setColour("red");
        car.setConvertible(true);
        car.setDoors(5);
        car.describeCar();

        System.out.println(car.getModel());


    }
}
