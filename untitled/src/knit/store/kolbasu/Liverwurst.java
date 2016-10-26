package knit.store.kolbasu;

import java.util.Scanner;

/**
 * Created by alex on 06.10.16.
 */
public class Liverwurst extends Sausage {
    private String category;
    @Override
    public void init(Scanner scanner){
        super.init(scanner);
        System.out.println("Категория ливерной колбасы: ");
        category =scanner.next();
    }
    @Override
    public String toString (){
        return super.toString()+"\nКатегория: "+ category;
    }
}
