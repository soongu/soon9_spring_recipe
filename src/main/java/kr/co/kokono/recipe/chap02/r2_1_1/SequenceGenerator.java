package kr.co.kokono.recipe.chap02.r2_1_1;

import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;

@Setter
public class SequenceGenerator {

    private String prefix;
    private String suffix;
    private int initial;
    private final AtomicInteger counter = new AtomicInteger();

    public String getSequence() {
        return prefix +
                initial +
                counter.getAndIncrement() +
                suffix;
    }
}
