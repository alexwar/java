package knit.tests;
import knit.enums.ProductFactory;
import knit.store.Product;
import org.junit.Test;

import java.io.CharArrayReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import static junit.framework.Assert.assertEquals;

/**
 * Created by alex on 26.10.16.
 */
public class test {
    @Test
    public void test(){
        ProductFactory factory =new ProductFactory();
        try {
            FileOutputStream f2 = new FileOutputStream ("./test11");
            FileInputStream f = new FileInputStream("./test1");
            Scanner t =new Scanner(f);
            Product ar;
            String klass=t.next();
            ar=factory.nextProduct(klass);
            ar.init(t);
            PrintWriter g= new PrintWriter(f2);
            g.write(ar.toString());
            f.close();
            f2.close();
            assertEquals(ar.toString(), "Название: Тестируемая\nТип: Тестик\nВес: 15.5\nСтоимость: 400");
        }
        catch (Exception e) {
            System.out.printf("Файл не найден.");
            assertEquals("1", "Название: Тестируемая\nТип: Тестик\nВес: 15.5\nСтоимость: 400");
        }
    }
}
