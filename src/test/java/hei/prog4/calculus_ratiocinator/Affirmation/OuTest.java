package hei.prog4.calculus_ratiocinator.Affirmation;

import static org.junit.jupiter.api.Assertions.*;

import hei.prog4.calculus_ratiocinator.Logics.Logic;
import org.junit.jupiter.api.Test;

public class OuTest {
    @Test
    public void test_Lou_est_beau_ou_Lou_est_beau() {
        Affirmation verite = new Verite("Lou est beau");
        Affirmation affirmation = new AffirmationGenerale(verite, verite, Logic.OU);
        assertTrue(affirmation.estVrai());
    }

    @Test
    public void test_Lou_est_beau_ou_Lou_est_pauvre() {
        Affirmation verite = new Verite("Lou est beau");
        Affirmation mensonge = new Mensonge("Lou est pauvre");
        Affirmation affirmation = new AffirmationGenerale(verite, mensonge, Logic.OU);
        assertTrue(affirmation.estVrai());
    }

    @Test
    public void test_Lou_est_pauvre_ou_Lou_est_pauvre() {
        Affirmation mensonge1 = new Mensonge("Lou est pauvre");
        Affirmation mensonge2 = new Mensonge("Lou est pauvre");
        Affirmation affirmation = new AffirmationGenerale(mensonge1, mensonge2, Logic.OU);
        assertFalse(affirmation.estVrai());
    }
}