class Product extends Binary {
    public Product(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }

    //implementing polymorphism.
    @Override
    public int evaluate() {
        return getLeft().evaluate() * getRight().evaluate();
    }
}