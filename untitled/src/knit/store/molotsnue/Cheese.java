package knit.store.molotsnue;

import java.text.MessageFormat;
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
        String str= "{0}\nМасса: {1}";
        return MessageFormat.format(str, super.toString(), weight);
    }
}
