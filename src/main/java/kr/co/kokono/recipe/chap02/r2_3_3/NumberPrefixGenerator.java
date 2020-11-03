package kr.co.kokono.recipe.chap02.r2_3_3;

import java.util.Random;

public class NumberPrefixGenerator implements PrefixGenerator {

    @Override
    public String getPrefix() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100);
        return String.format("%03d", randomInt);
    }
}
