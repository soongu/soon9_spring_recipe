package kr.co.kokono.recipe.chap02.r2_11.config;

import kr.co.kokono.recipe.chap02.r2_11.Cashier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("global")
@ComponentScan("kr.co.kokono.recipe.chap02.r2_11")
public class ShopConfigurationGlobal {

    @Bean(initMethod = "openFile", destroyMethod = "closeFile")
    public Cashier cashier() {
        final String path = System.getProperty("java.io.tmpdir") + "cashier";
        Cashier c1 = new Cashier();
        c1.setFileName("checkout");
        c1.setPath(path);
        return c1;
    }
}
