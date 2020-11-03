package kr.co.kokono.recipe.chap02.r2_3_2;

public interface SequenceDao {
    Sequence getSequence(String sequenceId);
    int getNextValue(String sequenceId);
}
