//A basic calculator which calculates integers using addition, subtraction, multiplication, divison and modulo

public class Calculator {
    int a;
    int b;

    public Calculator() {

    }

    public int add(int addA, int addB) {
        return addA + addB;
    }

    public int subtract(int subA, int subB) {
        return subA - subB;
    }

    public int multiply(int mltplyA, int mltplyB) {
        return mltplyA * mltplyB;
    }

    public int divide(int divA, int divB) {
        return divA / divB;
    }

    public int modulo(int modA, int modB) {
        return modA % modB;
    }

    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();

        int addition = myCalculator.add(5, 7);
        System.out.println(addition);

        int subtraction = myCalculator.subtract(45, 11);
        System.out.println(subtraction);

        int multiplication = myCalculator.multiply(5, 3);
        System.out.println(multiplication);

        int division = myCalculator.divide(18, 3);
        System.out.println(division);

        int mod = myCalculator.modulo(10, 3);
        System.out.println(mod);
    }
}
