package Pattern1.BatterCode.Builder;

public class Main {

    static void main() {
        Builder b = new Builder();
        b.setBrand("Apple");
        b.setPrice(100);

        Product p = new Product(b);
    }
}
