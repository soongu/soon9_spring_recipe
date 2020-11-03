package kr.co.kokono.recipe.chap02.r2_7;

import kr.co.kokono.recipe.chap02.r2_7.config.ShopConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ShopConfiguration.class);

        String alert = context.getMessage("alert.checkout", null, Locale.US);
        String alert_inventory = context.getMessage("alert.inventory.checkout", new Object[]{"[DVD-RW 3.0]", new Date()}, Locale.US);

        System.out.println("The I18N message for alert.checkout is: " + alert);
        System.out.println("The I18N message for alert.inventory.checkout is: " + alert_inventory);
    }
}
