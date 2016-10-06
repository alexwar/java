package knit.store.kolbasu;

import java.util.Scanner;

/**
 * Created by alex on 06.10.16.
 */
public class Livernaia extends Kolbasa {
    private String kategoria;
    @Override
    public void init(Scanner scanner){
        super.init(scanner);
        System.out.printf("Категория ливерной колбасы: ");
        kategoria=scanner.next();
    }
    @Override
    public String toString (){
        return super.toString()+"\nКатегория: "+kategoria;
    }
}
