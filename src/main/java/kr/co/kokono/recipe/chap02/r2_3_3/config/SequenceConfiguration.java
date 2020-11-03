package kr.co.kokono.recipe.chap02.r2_3_3.config;

import kr.co.kokono.recipe.chap02.r2_3_3.DatePrefixGenerator;
import kr.co.kokono.recipe.chap02.r2_3_3.NumberPrefixGenerator;
import kr.co.kokono.recipe.chap02.r2_3_3.SequenceGenerator;
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
        return new NumberPrefixGenerator();
    }

    @Bean
    public SequenceGenerator sequenceGenerator() {
        SequenceGenerator sequence = new SequenceGenerator();
        sequence.setInitial(100000);
        sequence.setSuffix("A");
        return sequence;
    }
}
