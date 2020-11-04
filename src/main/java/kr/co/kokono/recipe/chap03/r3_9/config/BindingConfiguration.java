package kr.co.kokono.recipe.chap03.r3_9.config;

import kr.co.kokono.recipe.chap03.r3_9.domain.SportTypeConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class BindingConfiguration implements WebMvcConfigurer {

    private final SportTypeConverter sportTypeConverter;

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(this.sportTypeConverter);
    }
}
