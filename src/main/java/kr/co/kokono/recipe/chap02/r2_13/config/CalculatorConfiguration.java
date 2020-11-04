package kr.co.kokono.recipe.chap02.r2_13.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "kr.co.kokono.recipe.chap02.r2_13")
public class CalculatorConfiguration {
}
