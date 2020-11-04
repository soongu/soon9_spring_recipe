package kr.co.kokono.recipe.chap02.r2_13;

import org.springframework.stereotype.Component;

@Component
public class UnitCalculatorImpl implements UnitCalculator {
    @Override
    public double kilogramToPound(double kilogram) {
        double pound = kilogram * 2.2;
        System.out.println(kilogram + " kilogram = " + pound + " pound");
        return pound;
    }

    @Override
    public double kilometerToMile(double kilometer) {
        double mile = kilometer * 0.62;
        System.out.println(kilometer + " kilometer = " + mile + " mile");
        return mile;
    }
}
