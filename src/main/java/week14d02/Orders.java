package week14d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Orders {

    private Map<String, TreeSet<String>> ordersMap = new HashMap<>();

    public void readFiles(String file){
        InputStreamReader is =new InputStreamReader(week14d02.Orders.class.getResourceAsStream(file));
        try (BufferedReader reader = new BufferedReader(is)){
            String line;
            while ((line = reader.readLine()) != null){
                String[] splitLine = line.split(" ");
                TreeSet<String> products = new TreeSet<>();
                Collections.addAll(products, splitLine[1].split(","));
                ordersMap.put(splitLine[0], products);
            }
        }
        catch (IOException ioe){
            throw new IllegalStateException("Can not read the file");
        }
    }

    public TreeSet<String> getProductsOrdersById(String id) {
        return ordersMap.get(id);
    }

    public Map<String, Integer> getProductsMap(){
        Map<String, Integer> productsMap = new HashMap<>();
        for(TreeSet<String> set:ordersMap.values()){
            for(String item:set){
                if (!productsMap.containsKey(item)){
                    productsMap.put(item,0);
                }
                productsMap.put(item,productsMap.get(item) + 1);
            }
        }
        return productsMap;
    }

    public int getNumberOfOrderedProducts(String product){
        return getProductsMap().get(product);
    }

    public int getNumberByOderedId(String id){
        return getProductsOrdersById(id).size();
    }

    public static void main(String[] args) {
        Orders orders = new Orders();
        orders.readFiles("orders.txt");
        System.out.println(orders.ordersMap);
        System.out.println(orders.getProductsOrdersById("A10")); //1.
        System.out.println(orders.getNumberOfOrderedProducts("bread")); //2.
        System.out.println(orders.getNumberByOderedId("A10")); //3.
        System.out.println(orders.getProductsMap()); //4.
    }
}
