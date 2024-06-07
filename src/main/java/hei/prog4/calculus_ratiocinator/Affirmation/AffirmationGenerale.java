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
    public String estVrai() {
        return logic.evalue(affirmation1.estVrai().equals("Vrai"), affirmation2.estVrai().equals("Vrai")) ? "Vrai" : "Faux";
    }
}