package Pattern1.BatterCode.BuilderAnotherBatterCode;

public class Main {
    static void main() {
        Product p = Product.getBuilder().setBrand("Tata").setUpdatedAt("NOW").build();


    }
}
