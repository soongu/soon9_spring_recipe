package kr.co.kokono.recipe.chap02.r2_6.config;

import kr.co.kokono.recipe.chap02.r2_6.BannerLoader;
import kr.co.kokono.recipe.chap02.r2_6.Battery;
import kr.co.kokono.recipe.chap02.r2_6.Disc;
import kr.co.kokono.recipe.chap02.r2_6.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("kr.co.kokono.recipe.chap02.r2_6")
@PropertySource("classpath:chap02/r2_6/discounts.properties")
public class ShopConfiguration {

    @Value("${endofyear.discount}")
    private double specialEndofyearDiscountField;

    @Value("${specialcustomer.discount:0}")
    private double specialCustomerDiscountField;

    @Value("${summer.discount:0}")
    private double specialSummerDiscountField;

    @Value("classpath:chap02/r2_6/banner.txt")
    private Resource banner;

    @Bean
    public BannerLoader bannerLoader() {
        BannerLoader bannerLoader = new BannerLoader();
        bannerLoader.setBanner(banner);
        return bannerLoader;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public Product aaa() {
        Battery p1 = new Battery();
        p1.setName("AAA");
        p1.setPrice(2.5);
        p1.setRechargeable(true);
        p1.setDiscount(specialCustomerDiscountField);
        return p1;
    }

    @Bean
    public Product cdrw() {
        Disc p2 = new Disc("CD-RW", 1.5, specialSummerDiscountField);
        p2.setCapacity(700);
        return p2;
    }

    @Bean
    public Product dvdrw() {
        Disc p2 = new Disc("DVD-RW", 3.0, specialEndofyearDiscountField);
        p2.setCapacity(700);
        return p2;
    }
}
