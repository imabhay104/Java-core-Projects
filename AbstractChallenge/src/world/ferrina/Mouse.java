package world.ferrina;

public class Mouse extends ProductForSale{

    public Mouse(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("type:"+type+" price: "+price+" Description: "+description);

    }
}
