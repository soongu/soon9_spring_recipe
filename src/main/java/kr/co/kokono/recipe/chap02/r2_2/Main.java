package kr.co.kokono.recipe.chap02.r2_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ShopConfig.class);

        Product aaa = context.getBean("aaa", Product.class);
        Product cdrw = context.getBean("cdrw", Product.class);

        System.out.println("aaa = " + aaa);
        System.out.println("cdrw = " + cdrw);
    }
}
