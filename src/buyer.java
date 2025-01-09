import java.util.ArrayList;
import java.util.List;

public class buyer {
    private String name;
    private ArrayList<Product> products;

    public buyer() {
        this.name = "";
        this.products= new ArrayList<>();

    }

    public ArrayList<Product> getProducts() {
        return products;
    }
    public void addProduct(Product p){
        products.add(p);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printProducts(){
        for(Product p: products){
            System.out.println(p.toString());
        }
    }


    public double Sum() {
        double sum=0;
        for(Product p: products){
            sum+=p.getPrice();
        }
        return sum;
    }
}
