import java.util.ArrayList;
import java.util.List;

// Abstract Product Class
abstract class Product {
    private String name;
    private double price;

    public Product(Product other){
        this.name= other.name;
        this.price=other.price;
    }
    public abstract Product clone();

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double calculateVAT(double price){
        return price*0.17;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String warranty();

    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price;
    }
}
