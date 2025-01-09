import java.util.HashMap;
public class DataManager {
    public static HashMap<Integer, Product> mockProducts(){
        HashMap<Integer, Product> h=new HashMap<>();
        Product p=new Smartphone("Samsung54", 1500);
        h.put(1, p);
        p=new Smartphone("iphone14", 2000);
        h.put(2, p);
        p=new Laptop("lenovoLegion", 7000);
        h.put(3, p);
        p=new Laptop("macbook", 6000);
        h.put(4, p);
        p = new TV("LG55OLED", 3000);
        h.put(5, p);
        p = new TV("SamsungQLED", 3500);
        h.put(6, p);
        p = new PC("DellOptiplex", 2500);
        h.put(7, p);
        p = new PC("HPProDesk", 2700);
        h.put(8, p);


        return h;
    }

}
