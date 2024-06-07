package hei.prog4.calculus_ratiocinator.Logics;

import java.util.function.BiFunction;

public enum Logic {
    ET((affirmation1, affirmation2) -> affirmation1 && affirmation2),
    OU((affirmation1, affirmation2) -> affirmation1 || affirmation2),
    DONC((affirmation1, affirmation2) -> !affirmation1 || affirmation2);

    private final BiFunction<Boolean, Boolean, Boolean> evaluator;

    Logic(BiFunction<Boolean, Boolean, Boolean> evaluator) {
        this.evaluator = evaluator;
    }

    public boolean evalue(boolean affirmation1, boolean affirmation2) {
        return evaluator.apply(affirmation1, affirmation2);
    }
}