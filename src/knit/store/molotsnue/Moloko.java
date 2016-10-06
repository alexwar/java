package knit.store.molotsnue;

import knit.store.molotsnue.Molostnui;

import java.util.Scanner;

/**
 * Created by alex on 06.10.16.
 */
public class Moloko extends Molostnui {
    private float sirnost;
    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.printf("Жиронсть: ");
        sirnost=scanner.nextFloat();
        cost=scanner.nextInt();
    }
    @Override
    public String toString(){
        return super.toString()+"\nЖиронсть: "+sirnost;
    }
}
