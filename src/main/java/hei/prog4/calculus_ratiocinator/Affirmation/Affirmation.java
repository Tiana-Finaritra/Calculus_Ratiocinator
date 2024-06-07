package hei.prog4.calculus_ratiocinator.Affirmation;

public sealed abstract class Affirmation permits AffirmationGenerale, Mensonge, Vérité {
    public abstract boolean estVrai();
}