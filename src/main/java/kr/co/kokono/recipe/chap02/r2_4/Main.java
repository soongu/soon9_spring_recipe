package kr.co.kokono.recipe.chap02.r2_4;

import kr.co.kokono.recipe.chap02.r2_4.config.SequenceConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SequenceConfiguration.class);

        SequenceGenerator generator =
                (SequenceGenerator) context.getBean("sequenceGenerator");

        System.out.println(generator.getSequence());
        System.out.println(generator.getSequence());
    }
}
