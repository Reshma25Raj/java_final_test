abstract class Binary extends ArithmeticExp {
    private ArithmeticExp left;
    private ArithmeticExp right;

    public Binary(ArithmeticExp left, ArithmeticExp right) {
        this.left = left;
        this.right = right;
    }

    //making it a separate function to avoid direct access to left  providing more encapsulation

    public ArithmeticExp getLeft() {
        return left;
    }

    //making it a seperate function to avoid direct access to right field providing more encapsulation

    public ArithmeticExp getRight() {
        return right;
    }
}