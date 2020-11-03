package kr.co.kokono.recipe.chap02.r2_1_2;

public interface SequenceDao {
    Sequence getSequence(String sequenceId);
    int getNextValue(String sequenceId);
}
