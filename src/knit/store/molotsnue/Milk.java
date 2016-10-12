package knit.store.molotsnue;

import java.util.Scanner;

/**
 * Created by alex on 06.10.16.
 */
public class Milk extends Milky {
    private float fatness;
    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.printf("Жиронсть: ");
        fatness =scanner.nextFloat();
        cost=scanner.nextInt();
    }
    @Override
    public String toString(){
        return super.toString()+"\nЖиронсть: "+ fatness;
    }
}
