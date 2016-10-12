package knit; /**
 * Created by alex on 29.09.16.
 */
import knit.enums.ProductFactory;
import knit.store.Product;

import java.util.Scanner;

public class Application {
    public static void main(String[] arg) {
            //FileInputStream f = new FileInputStream("~/test2");
            Scanner tm = new Scanner(System.in);
            System.out.print("товары: ");

            int kol = tm.nextInt();
            Product arr[] = new Product[kol];
            ProductFactory test =new ProductFactory();
            for (int i = 0; i < kol; i++) {
                try {
                    String klass=tm.next();
                    arr[i] = test.nextProduct(klass);
                    arr[i].init(tm);
                } catch (Exception e) {
                    System.out.printf("Неизвестный класс");
                }
            }
            for (int i = 0; i<arr.length; i++)
                System.out.printf(arr[i].toString());
    }
}


