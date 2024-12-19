public class Car {
    private String description;
    public Car(String description) {
        this.description = description;
    }
//    public Car registerCar(String description)
//    {
//
//    }
    public void startEngine()
    {
        System.out.println("Car Starting");
    }
    public void drive()
    {
        System.out.println("Car driving, type is "+getClass().getSimpleName());
        runEngine();

    }
    protected void runEngine()
    {
        System.out.println("Car Engine running");

    }
}
