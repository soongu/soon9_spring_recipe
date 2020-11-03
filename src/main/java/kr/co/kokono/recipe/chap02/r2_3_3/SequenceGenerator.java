package kr.co.kokono.recipe.chap02.r2_3_3;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SequenceGenerator {

    @Autowired
    //private PrefixGenerator[] prefixGenerators;
    private List<PrefixGenerator> prefixGenerators;

    private String suffix;
    private int initial;
    private AtomicInteger counter = new AtomicInteger();


    public String getSequence() {
        StringBuilder builder = new StringBuilder();
        for (PrefixGenerator prefix : prefixGenerators) {
            builder.append(prefix.getPrefix());
            builder.append("-");
        }
        builder.append(initial).append(counter.getAndIncrement()).append(suffix);
        return builder.toString();
    }
}
