package kr.co.kokono.recipe.chap02.r2_13;

import org.springframework.stereotype.Component;

@Component
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {
    @Override
    public double add(double a, double b) {
        double result = a + b;
        System.out.printf("%d + %d = %d\n", a, b, result);
        return result;
    }

    @Override
    public double sub(double a, double b) {
        return 0;
    }

    @Override
    public double mul(double a, double b) {
        return 0;
    }

    @Override
    public double div(double a, double b) {
        return 0;
    }
}
