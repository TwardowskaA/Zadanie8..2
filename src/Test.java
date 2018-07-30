import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Product[] pro = new Product[2];

        for (int i = 0; i < pro.length; i++) {
            System.out.println("Podaj nazwę");
            String name = scan.nextLine();
            System.out.println("Podaj cenę");
            double price = scan.nextDouble();
            scan.nextLine();

            Product product = new Product(name, price);
            if (!zawiera(product, pro))
                pro[i] = product;
            else i--;
        }
        System.out.println(Arrays.toString(pro));

    }

    public static boolean zawiera(Product product, Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if (product.equals(products[i]))
                return true;

        }
        return false;
    }

}
