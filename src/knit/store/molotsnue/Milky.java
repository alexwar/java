package knit.store.molotsnue;

import knit.store.Product;

import java.util.Scanner;

public class Milky extends Product {
    protected int godd;
    protected String name;
    protected int cost;
    @Override
    public void init(Scanner scanner) {
        System.out.printf("Название продукта: ");
        name=scanner.next();
        System.out.printf("Срок годности(дней): ");
        godd=scanner.nextInt();
        System.out.printf("Стоимость: ");
        cost=scanner.nextInt();
    }

    @Override
    public String toString(){
        return "Молочный продукт: "+name+"\nCрок годности(дней): "+godd+"\nCтоимость: "+cost;
    }
}
