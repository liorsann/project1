import java.util.*;

public class Main {

   // private static HashMap<Integer, Product> map= new HashMap<>();
   private static HashMap <Integer, Product> a=DataManager.mockProducts();
    private static Scanner r=new Scanner(System.in);
    public static void main(String[] args) {
    startOrder();



    }
    public static void startOrder(){
        buyer buyer1 =new buyer();
        System.out.println("enter name:");
        String name=r.nextLine();
        buyer1.setName(name);
        System.out.println("enter product num:");

        int ind=1;
        System.out.println("press 0 to quit");
        for(Product i: a.values()){

            System.out.println(ind + "."+ i.toString());
            ind++;
        }
        boolean flag=true;
        while(true) {
            int order = r.nextInt();
            if (order == 0) {

                break;
            }
            if (!a.containsKey(order))
                continue;

            buyer1.addProduct(  a.get(order).clone());


            System.out.println("added:" + a.get(order).getName());





        }
        // copon after exit
        System.out.println("enter copon or 0:");
        String copon= r.nextLine();
        copon= r.nextLine();

        ArrayList<Product> products=buyer1.getProducts();
        if(copon.equals("HOLIDAY30")) {
            Set<String> used= new HashSet<>();

            for (Product i : products) {
                if(!used.contains(i.getName())){
                    i.setPrice(i.getPrice()*0.7);
                    used.add(i.getName());
                }

            }
        }






        System.out.println("Products:");
        buyer1.printProducts();
        System.out.println( buyer1.Sum());





    }


}