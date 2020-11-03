package kr.co.kokono.recipe.chap02.r2_4.config;

import kr.co.kokono.recipe.chap02.r2_4.DatePrefixGenerator;
import kr.co.kokono.recipe.chap02.r2_4.NumberPrefixGenerator;
import kr.co.kokono.recipe.chap02.r2_4.SequenceGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SequenceConfiguration {
    @Bean
    public DatePrefixGenerator datePrefixGenerator() {
        DatePrefixGenerator dpg = new DatePrefixGenerator();
        dpg.setPattern("yyyyMMdd");
        return dpg;
    }

    @Bean
    public NumberPrefixGenerator numberPrefixGenerator() {
        NumberPrefixGenerator npg = new NumberPrefixGenerator();
        return npg;
    }

    @Bean
    public SequenceGenerator sequenceGenerator() {
        SequenceGenerator sequence = new SequenceGenerator();
        sequence.setInitial(100000);
        sequence.setSuffix("A");
        return sequence;
    }
}
