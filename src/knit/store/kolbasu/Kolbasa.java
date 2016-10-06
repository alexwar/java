package knit.store.kolbasu;

import knit.store.Product;

import java.util.Scanner;

/**
 * Created by alex on 06.10.16.
 */
public class Kolbasa extends Product{

    protected String name;
    protected int cost;
    protected float ves;
    protected String tip;
    @Override
    public void init(Scanner scanner){
        System.out.printf("Название: ");
        name=scanner.next();
        System.out.printf("Тип: ");
        tip=scanner.next();
        System.out.printf("Вес: ");
        ves=scanner.nextFloat();
        System.out.printf("Стоимость: ");
        cost=scanner.nextInt();
    }
    @Override
    public String toString (){
        return "Название: "+name+"\nТип"+tip+"\nВес"+ves+"\nСтоимость"+cost;
    }

}
