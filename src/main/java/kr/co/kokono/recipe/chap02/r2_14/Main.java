package kr.co.kokono.recipe.chap02.r2_14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class  Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(CalculatorConfiguration.class);

        ArithmeticCalculator ari = context.getBean(ArithmeticCalculator.class);
        ari.add(1, 2);
        ari.sub(4, 3);
        ari.mul(2, 3);
        ari.div(4, 2);

        UnitCalculator unit = context.getBean(UnitCalculator.class);
        unit.kilogramToPound(10);
        unit.kilometerToMile(160);
    }
}
