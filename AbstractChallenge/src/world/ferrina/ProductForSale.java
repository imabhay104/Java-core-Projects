package world.ferrina;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return quantity * this.price;
    }

    public void printPricedItem(int quantity) {
        System.out.println(this.price + " (" + quantity + ")");
    }

    public abstract void showDetails();





}
