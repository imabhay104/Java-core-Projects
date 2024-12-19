public class Showroom {
    public final Vehicle vehicle;

    public Showroom(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Vehicle getVehicle()
    {
        return this.vehicle;
    }
    public void showfeatures()
    {
        System.out.println(vehicle.move());
        System.out.println(vehicle.Features());

    }
}
