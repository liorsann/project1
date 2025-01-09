import java.util.List;

class Laptop extends Computer implements Portabale {
    public Laptop(String name, double price) {
        super(name, price);
    }
    public Laptop(Laptop other){
        super(other);
    }
    @Override
    public Product clone() {
        return new Laptop(this);
    }

    @Override
    public String warranty() {
        return "Battery and hardware warranty.";
    }

    @Override
    public void weight() {
        System.out.println("2kg");
    }

    @Override
    public String toString() {
        return "Laptop: " + super.toString();
    }
    @Override
    public double calculateVAT(double price){
        return price*0.1;
    }
}
