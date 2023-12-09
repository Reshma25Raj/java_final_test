class Modulo extends Binary {
    public Modulo(ArithmeticExp left, ArithmeticExp right) {
        super(left, right);
    }

    @Override
    public int evaluate() {
        return getLeft().evaluate() % getRight().evaluate();
    }

    @Override
    public String toString() {
        return getLeft().toString() + " % " + getRight().toString();
    }
}
