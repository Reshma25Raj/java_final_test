// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Constructing the expression 3 + 2 * 5
        ArithmeticExp exp = new Sum(new Number(3), new Product(new Number(2), new Number(5)));

        System.out.println(exp.evaluate());
    }
}