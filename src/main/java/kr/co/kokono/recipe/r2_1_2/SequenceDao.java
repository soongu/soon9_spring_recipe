package kr.co.kokono.recipe.r2_1_2;

public interface SequenceDao {
    Sequence getSequence(String sequenceId);
    int getNextValue(String sequenceId);
}
