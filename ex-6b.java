public class Main {
    public static void main(String[] args) {
        Logarithm log1 = new Logarithm(3,9);
        System.out.println(log1.doubleValue());
        Logarithm log2 = new Logarithm(5,200);
        System.out.println(log2.doubleValue());
        Logarithm log3 = new Logarithm(-2,4);
        System.out.println(log3.doubleValue());
    }
}

class Logarithm implements Number {
    private double base, argument;
    public double doubleValue() {
        try {
            if (base <= 0 || base== 1){
                throw new ArithmeticException(String.format("\nBase of logarithm must be grater than 0 and not be equal to 1.\nYour value: " + base));
            }
            if (argument <= 0){
                throw new ArithmeticException(String.format("\nArgument of lagarithm cannot be greater then 0.\n Your value: " + argument));
            }
            return(Math.log(argument)/Math.log(base));
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Error: " + e);
        }
    }
    public Logarithm(double inputBase, double inputArgument) {
        this.base = inputBase;
        this.argument = inputArgument;
    }
}

interface Number {
    public double doubleValue();
}
