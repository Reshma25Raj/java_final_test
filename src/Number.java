public class Number extends ArithmeticExp {
    private int value; // keeping the value field private providing encapsulation

    public Number(int value) {
        this.value = value;
    }

    //Overrides the evaluate() method to return its value.
    @Override
    public int evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
