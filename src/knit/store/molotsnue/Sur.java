package knit.store.molotsnue;

//import knit.Molostnui;

import knit.Molostnui;

import java.util.Scanner;


public class Sur extends Molostnui {
    private float massa;
    @Override
    public void init(Scanner scanner) {
        super.init(scanner);
        System.out.printf("Масса(гр): ");
        massa=scanner.nextFloat();
    }
    @Override
    public String toString(){
        return super.toString()+"\nМасса(гр): "+massa;
    }
}
