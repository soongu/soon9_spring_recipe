package kr.co.kokono.recipe.chap02.r2_1_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SeqMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("kr.co.kokono.recipe.chap02.r2_1_2");
        SequenceDao dao = context.getBean(SequenceDao.class);

        System.out.println(dao.getNextValue("IT"));
        System.out.println(dao.getNextValue("IT"));
        System.out.println(dao.getNextValue("IT"));
        System.out.println(dao.getNextValue("IT"));
        System.out.println(dao.getNextValue("IT"));
    }
}
