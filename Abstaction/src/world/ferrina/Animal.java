package world.ferrina;

public abstract class Animal {
protected String type;
    protected String size;
    protected String weight;
public Animal(String type,String size,String weight)
{
 this.type=type;
 this.size=size;
 this.weight=weight;
}
    public  abstract void move(String speed);

public  abstract void makeNoise();


}

