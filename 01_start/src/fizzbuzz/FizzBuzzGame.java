package fizzbuzz;

public class FizzBuzzGame {
    public static void main(String[] args) {
        new FizzBuzzGame().doFizzBuzz();
    }

    void doFizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(doSingleFizzBuzz(i));

            if (isNotLastNumber(i)) {
                System.out.print(",");
            }
        }
    }

    boolean isNotLastNumber(int i) {
        return i < 100;
    }

    String doSingleFizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return "" + i;
        }
    }
}
