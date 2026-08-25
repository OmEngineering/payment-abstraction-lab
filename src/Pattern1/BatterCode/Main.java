package Pattern1.BatterCode;

public class Main {
    static void main() {
    //Just using setter will not work

        /*
         * Benefits:
         * - More readable
         * - More maintainable
         * - More extensible
         * - What about immutable objects
         */

        /*
         * Problems:
         * - Validation
         * - We want to validate the object before it is created,
         *   rather than after creation.
         * - Validation should happen before setting the values.
         */

        Product p = new Product();
        p.setName("Iphone");
        p.setBrand("Apple");
    }
}
