package knit.store.kolbasu;

import java.util.Scanner;

/**
 * Created by alex on 06.10.16.
 */
public class Varenaia extends Kolbasa {
    private float sou;
    @Override
    public void init(Scanner scanner){
        super.init(scanner);
        System.out.printf("Количество сои(гр): ");
        sou=scanner.nextFloat();
    }
    @Override
    public String toString(){
        return super.toString()+"\nСои(гр): "+sou;
    }
}
