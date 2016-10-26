package knit;
import java.io.FileInputStream;
import java.util.Scanner;
import knit.enums.ProductFactory;
import knit.store.Product;


public class Application {
    public static void main(String[] arg) {
            //FileInputStream f = new FileInputStream("~/test2");
            Scanner tm = new Scanner(System.in);
            System.out.print("товары: ");
            int kol=0;
            try {
                kol = tm.nextInt();
            } catch (Exception e) {
                System.out.printf("Неверный ввод числа");
            }
            Product arr[] = new Product[kol];
            ProductFactory factory =new ProductFactory();
            for (int i = 0; i < kol; i++) {
                try {
                    String klass=tm.next();
                    arr[i] = factory.nextProduct(klass);
                    arr[i].init(tm);
                } catch (Exception e) {
                    System.out.printf("Неизвестный класс");
                }
            }
        for (Product i: arr) {
            System.out.printf(i.toString());
        }

    }
}


