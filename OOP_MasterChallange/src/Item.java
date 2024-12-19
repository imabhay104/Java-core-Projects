public class Item {
    private String name;
    private String type;
    private double price;
    private String size;

    public Item(String type, double price, String name, String size) {
        this.type = type;
        this.price = price;
        this.name = name;
        this.size = size;
    }
    public Item() {

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void printItem() {
        System.out.println( "Item{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", size='" + size + '\'' +
                '}');
    }

}
