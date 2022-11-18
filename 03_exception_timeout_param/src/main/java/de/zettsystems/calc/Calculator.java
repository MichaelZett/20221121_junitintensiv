package de.zettsystems.calc;

public class Calculator {

    public int add(int a, int b) {
        return a+b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new DoNotDivideByZero();
        }
        return ((double)  a)/b;
    }

    public long nextPrime() {
        try {
            Thread.sleep(1000*7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Long.MAX_VALUE;
    }
}
