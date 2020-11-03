package kr.co.kokono.recipe.chap02.r2_1_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SeqMain {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SeqConfig.class);
        SequenceGenerator sequenceGenerator = context.getBean(SequenceGenerator.class);

        System.out.println(sequenceGenerator.getSequence());
        System.out.println(sequenceGenerator.getSequence());
        System.out.println(sequenceGenerator.getSequence());
    }
}
