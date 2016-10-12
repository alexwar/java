package knit.store.molotsnue;

import java.util.Scanner;


public class Cheese extends Milky {
    private float weight;
    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.printf("Масса(гр): ");
        weight =scanner.nextFloat();
    }
    @Override
    public String toString(){
        return super.toString()+"\nМасса(гр): "+ weight;
    }
}
