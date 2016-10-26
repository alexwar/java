package knit.enums;

import knit.store.Product;
import knit.store.kolbasu.Boiled;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by alex on 12.10.16.
 */
public class ProductFactory2 {
    private enum Id {
        Bolied, Liverwurst
    }

    private Map<String, Id> names=new HashMap<String, Id>();
    {
        names.put("Bolied",Id.Bolied);
    }
    public Product nextProduct(String klass){
        Product x=null;
        if (names.containsKey(klass))
            switch (names.get(klass)){
                case Bolied: x=new Boiled();
                    break;
            }
            return x;
    }
}
