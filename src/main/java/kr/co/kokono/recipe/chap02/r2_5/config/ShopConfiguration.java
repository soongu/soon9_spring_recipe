package kr.co.kokono.recipe.chap02.r2_5.config;

import kr.co.kokono.recipe.chap02.r2_5.Battery;
import kr.co.kokono.recipe.chap02.r2_5.Disc;
import kr.co.kokono.recipe.chap02.r2_5.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("kr.co.kokono.recipe.chap02.r2_5")
public class ShopConfiguration {

    @Bean
    public Product aaa() {
        Battery p1 = new Battery();
        p1.setName("AAA");
        p1.setPrice(2.5);
        p1.setRechargeable(true);
        return p1;
    }

    @Bean
    public Product cdrw() {
        Disc p2 = new Disc("CD-RW", 1.5);
        p2.setCapacity(700);
        return p2;
    }

    @Bean
    public Product dvdrw() {
        Disc p2 = new Disc("DVD-RW", 3.0);
        p2.setCapacity(700);
        return p2;
    }
}
