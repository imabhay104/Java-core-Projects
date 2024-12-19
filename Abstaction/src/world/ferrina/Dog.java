package world.ferrina;

public class Dog extends Animal{
    public Dog(String type, String size, String weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

    }

    @Override
    public void makeNoise() {
        if (type.equals("DOG")) System.out.println("Bhau bhau"); else System.out.println("ahhh");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight='" + weight + '\'' +
                ", size='" + size + '\'' +
                ", type='" + type + '\'' +
                "} " + super.toString();
    }
}
