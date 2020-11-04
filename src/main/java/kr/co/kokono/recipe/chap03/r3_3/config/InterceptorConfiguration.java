package kr.co.kokono.recipe.chap03.r3_3.config;

import kr.co.kokono.recipe.chap03.r3_3.web.MeasureInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(measureInterceptor())
                .addPathPatterns("/r3_3/*")
                .excludePathPatterns("/r3_1/*");
    }

    @Bean
    public MeasureInterceptor measureInterceptor() {
        return new MeasureInterceptor();
    }
}
