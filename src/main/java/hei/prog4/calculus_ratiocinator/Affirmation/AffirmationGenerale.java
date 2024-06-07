package hei.prog4.calculus_ratiocinator.Affirmation;

import hei.prog4.calculus_ratiocinator.Logics.Logic;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public final class AffirmationGenerale extends Affirmation {
    private Affirmation affirmation1;
    private Affirmation affirmation2;
    private Logic logic;

    @Override
    public boolean estVrai() {
        return logic.evalue(affirmation1.estVrai(), affirmation2.estVrai());
    }

}