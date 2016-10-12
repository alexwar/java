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

/**
 * Created by wlad on 01.10.2016.
 */
public class ProductFactory {

    private static class ProductIds {
        String id;
        Class<?> cl;
        ProductIds (String id, Class<?> cl) {
            this.id = id;
            this.cl = cl;
        }
    }

    private static final ArrayList<ProductIds> productIDs = new ArrayList<ProductIds>();

    private static Comparator<ProductIds> cmp = new Comparator<ProductIds>() {
        public int compare(ProductIds item1, ProductIds item2) {
            return item1.id.compareTo(item2.id);
        }
    };

    static {
        productIDs.add(new ProductIds("Молочный", Milky.class));
        productIDs.add(new ProductIds("Сыр", Cheese.class));
        productIDs.add(new ProductIds("Молоко", Milk.class));
        productIDs.add(new ProductIds("Колбаса", Sausage.class));
        productIDs.add(new ProductIds("Варенная_Колбаса", Boiled.class));
        productIDs.add(new ProductIds("Ливерная_Колбаса", Liverwurst.class));
        Collections.sort(productIDs, cmp);
    }


    public Product nextProduct(String klass) throws Exception{
        ProductIds t = new ProductIds(null, null);
            t.id = klass;
            int i = Collections.binarySearch(productIDs, t, cmp);
            if (i > -1) {
                ProductIds x = productIDs.get(i);
                Product p = (Product)x.cl.newInstance();
                return p;
            } else
                throw new Exception("Неизвестный тип продукта " + t.id);
    }
}
