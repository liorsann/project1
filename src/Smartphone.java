public class Smartphone extends Product implements Portabale{
    public Smartphone(String name, double price){
        super(name, price);
    }
    public Smartphone(Smartphone other){
        super(other);

    }
    @Override
    public Product clone(){
        return new Smartphone(this);
    }
    @Override
    public String warranty() {
        return "screen and battery";
    }
    @Override
    public String toString() {
        return "Smartphone: " + super.toString();
    }

    @Override
    public void weight() {
        System.out.println("200g");
    }
}
