package knit.enums;

import knit.store.kolbasu.Kolbasa;
import knit.store.kolbasu.Livernaia;
import knit.store.kolbasu.Varenaia;
import knit.store.molotsnue.Moloko;
import knit.store.molotsnue.Molostnui;
import knit.store.Product;
import knit.store.molotsnue.Sur;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
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
        productIDs.add(new ProductIds("Молочный", Molostnui.class));
        productIDs.add(new ProductIds("Сыр", Sur.class));
        productIDs.add(new ProductIds("Молоко", Moloko.class));
        productIDs.add(new ProductIds("Колбаса", Kolbasa.class));
        productIDs.add(new ProductIds("Варенная_Колбаса", Varenaia.class));
        productIDs.add(new ProductIds("Ливерная_Колбаса", Livernaia.class));
        Collections.sort(productIDs, cmp);
    }


    public Product nextProduct(Scanner scaner) throws Exception{
        ProductIds t = new ProductIds(null, null);
        if (scaner.hasNext()) {
            t.id = scaner.next();
            int i = Collections.binarySearch(productIDs, t, cmp);
            if (i > -1) {
                ProductIds x = productIDs.get(i);
                Product p = (Product)x.cl.newInstance();
                p.init(scaner);
                return p;
            } else
                throw new Exception("Неизвестный тип продукта " + t.id);
        }
        return null;
    }
}
