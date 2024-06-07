package hei.prog4.calculus_ratiocinator.Affirmation;

public sealed abstract class Affirmation permits AffirmationGenerale, Mensonge, Verite {
    public abstract boolean estVrai();
}