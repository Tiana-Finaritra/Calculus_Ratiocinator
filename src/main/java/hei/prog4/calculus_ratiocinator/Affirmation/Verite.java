package hei.prog4.calculus_ratiocinator.Affirmation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public final class Verite extends Affirmation {
    private String description;

    @Override
    public boolean estVrai() {
        return true;
    }

}
