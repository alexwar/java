package knit.enums;

import knit.store.kolbasu.Sausage;
import knit.store.kolbasu.Liverwurst;
import knit.store.kolbasu.Boiled;
import knit.store.molotsnue.Milk;
import knit.store.molotsnue.Milky;
import knit.store.Product;
import knit.store.molotsnue.Cheese;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;


public class ProductFactory {


    private static class ProductId implements Comparable<ProductId>{
        String id;
        Class<?> cl;
        ProductId (String id, Class<?> cl) {
            this.id = id;
            this.cl = cl;
        }
        @Override
        public int compareTo (ProductId item){
            return id.compareTo(item.id);
        }
    }

    private static final ArrayList<ProductId> productIDs = new ArrayList<ProductId>();

    /*private static Comparator<ProductIds> cmp = new Comparator<ProductIds>() {
        public int compare(ProductIds item1, ProductIds item2) {
            return item1.id.compareTo(item2.id);
        }
    };*/

    static {
        productIDs.add(new ProductId("Молочный", Milky.class));
        productIDs.add(new ProductId("Сыр", Cheese.class));
        productIDs.add(new ProductId("Молоко", Milk.class));
        productIDs.add(new ProductId("Колбаса", Sausage.class));
        productIDs.add(new ProductId("Варенная_Колбаса", Boiled.class));
        productIDs.add(new ProductId("Ливерная_Колбаса", Liverwurst.class));
        Collections.sort(productIDs);
    }


    public Product nextProduct(String klass) throws Exception{
        ProductId t = new ProductId(null, null);
            t.id = klass;
            int i = Collections.binarySearch(productIDs, t);
            if (i > -1) {
                ProductId x = productIDs.get(i);
                Product p = (Product)x.cl.newInstance();
                return p;
            } else
                throw new Exception("Неизвестный тип продукта " + t.id);
    }
}
